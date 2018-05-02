package SpringJDBC;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/18 11:15
 * @Description:
 **/

// 7、 Spring JDBC 框架
// 7.1 Spring JDBC 示例
/*
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public void create(String name, Integer age) {
        String SQL = "insert into Student (name, age) values (?, ?)";
        jdbcTemplateObject.update( SQL, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
    }
    public Student getStudent(Integer id) {
        String SQL = "select * from Student where id = ?";
        Student student = jdbcTemplateObject.queryForObject(SQL,
                new Object[]{id}, new StudentMapper());
        return student;
    }
    public List<Student> listStudents() {
        String SQL = "select * from Student";
        List <Student> students = jdbcTemplateObject.query(SQL,
                new StudentMapper());
        return students;
    }
    public void delete(Integer id){
        String SQL = "delete from Student where id = ?";
        jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id );
        return;
    }
    public void update(Integer id, Integer age){
        String SQL = "update Student set age = ? where id = ?";
        jdbcTemplateObject.update(SQL, age, id);
        System.out.println("Updated Record with ID = " + id );
        return;
    }
}
*/

// 7.2、Spring 中 SQL 的存储过程 (按照例子未成功)
/*
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private SimpleJdbcCall jdbcCall;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcCall =  new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
    }
    public void create(String name, Integer age) {
        JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
        String SQL = "insert into Student (name, age) values (?, ?)";

        jdbcTemplateObject.update( SQL, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
    }
    public Student getStudent(Integer id) {
        SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
        Map<String, Object> out = jdbcCall.execute(in);

        Student student = new Student();
        student.setId(id);
        student.setName((String) out.get("out_name"));
        student.setAge((Integer) out.get("out_age"));
        return student;
    }
    public List<Student> listStudents() {
        String SQL = "select * from Student";
        List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
        return students;
    }
}
*/

// 8、Spring 事务管理
// 8.1、Spring 编程式事务管理
/*
import java.util.List;
import javax.sql.DataSource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    private PlatformTransactionManager transactionManager;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public void setTransactionManager(
            PlatformTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }
    public void create(String name, Integer age, Integer marks, Integer year){
        TransactionDefinition def = new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(def);
        try {
            String SQL1 = "insert into Student (name, age) values (?, ?)";
            jdbcTemplateObject.update( SQL1, name, age);
            // Get the latest student id to be used in Marks table
            String SQL2 = "select max(id) from Student";
            int sid = jdbcTemplateObject.queryForObject( SQL2, Integer.class);
            String SQL3 = "insert into Marks(sid, marks, year) " +
                    "values (?, ?, ?)";
            jdbcTemplateObject.update( SQL3, sid, marks, year);
            System.out.println("Created Name = " + name + ", Age = " + age);
            transactionManager.commit(status);
        } catch (DataAccessException e) {
            System.out.println("Error in creating record, rolling back");
            transactionManager.rollback(status);
            throw e;
        }
        return;
    }
    public List<StudentMarks> listStudents() {
        String SQL = "select * from Student, Marks where Student.id=Marks.sid";
        List <StudentMarks> studentMarks = jdbcTemplateObject.query(SQL,
                new StudentMarksMapper());
        return studentMarks;
    }
}
*/

// 8.2、Spring 声明式事务管理
import java.util.List;
import javax.sql.DataSource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
public class StudentJDBCTemplate implements StudentDAO{
    private JdbcTemplate jdbcTemplateObject;
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public void create(String name, Integer age, Integer marks, Integer year){
        try {
            String SQL1 = "insert into Student (name, age) values (?, ?)";
            jdbcTemplateObject.update( SQL1, name, age);
            // Get the latest student id to be used in Marks table
            String SQL2 = "select max(id) from Student";
            int sid = jdbcTemplateObject.queryForObject( SQL2, Integer.class);
            String SQL3 = "insert into Marks(sid, marks, year) " +
                    "values (?, ?, ?)";
            jdbcTemplateObject.update( SQL3, sid, marks, year);
            System.out.println("Created Name = " + name + ", Age = " + age);
            // to simulate the exception.
            throw new RuntimeException("simulate Error condition") ;
        } catch (DataAccessException e) {
            System.out.println("Error in creating record, rolling back");
            throw e;
        }
    }
    public List<StudentMarks> listStudents() {
        String SQL = "select * from Student, Marks where Student.id=Marks.sid";
        List <StudentMarks> studentMarks=jdbcTemplateObject.query(SQL,
                new StudentMarksMapper());
        return studentMarks;
    }
}