package SpringJDBC;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/18 11:09
 * @Description:
 **/

// 7、 Spring JDBC 框架
// 7.1 Spring JDBC 示例
/*
import java.util.List;
import javax.sql.DataSource;
public interface StudentDAO {
    public void setDataSource(DataSource ds);
    public void create(String name, Integer age);
    public Student getStudent(Integer id);
    public List<Student> listStudents();
    public void delete(Integer id);
    public void update(Integer id, Integer age);
}
*/


// 7.2、Spring 中 SQL 的存储过程 (按照例子未成功)
/*
import java.util.List;
import javax.sql.DataSource;
public interface StudentDAO {
    public void setDataSource(DataSource ds);
    public void create(String name, Integer age);
    public Student getStudent(Integer id);
    public List<Student> listStudents();
}
*/

// 8、Spring 事务管理
// 8.1、Spring 编程式事务管理
// 8.2、Spring 声明式事务管理
import java.util.List;
import javax.sql.DataSource;
public interface StudentDAO {
    public void setDataSource(DataSource ds);
    public void create(String name, Integer age, Integer marks, Integer year);
    public List<StudentMarks> listStudents();
}
