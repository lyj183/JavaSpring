package SpringJDBC;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/18 15:46
 * @Description:
 **/

// 8、Spring 事务管理
// 8.1、Spring 编程式事务管理
// 8.2、Spring 声明式事务管理
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
public class StudentMarksMapper implements RowMapper<StudentMarks> {
    public StudentMarks mapRow(ResultSet rs, int rowNum) throws SQLException {
        StudentMarks studentMarks = new StudentMarks();
        studentMarks.setId(rs.getInt("id"));
        studentMarks.setName(rs.getString("name"));
        studentMarks.setAge(rs.getInt("age"));
        studentMarks.setSid(rs.getInt("sid"));
        studentMarks.setMarks(rs.getInt("marks"));
        studentMarks.setYear(rs.getInt("year"));
        return studentMarks;
    }
}
