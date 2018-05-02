package SpringJDBC;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/18 11:13
 * @Description:
 **/

// 7、 Spring JDBC 框架
// 7.1 Spring JDBC 示例
// 7.2、Spring 中 SQL 的存储过程 (按照例子未成功)
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
public class StudentMapper implements RowMapper<Student> {
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setAge(rs.getInt("age"));
        return student;
    }
}


