package SpringJDBC;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/18 15:45
 * @Description:
 **/

// 8、Spring 事务管理
// 8.1、Spring 编程式事务管理
// 8.2、Spring 声明式事务管理
public class StudentMarks {
    private Integer age;
    private String name;
    private Integer id;
    private Integer marks;
    private Integer year;
    private Integer sid;
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public void setMarks(Integer marks) {
        this.marks = marks;
    }
    public Integer getMarks() {
        return marks;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public Integer getYear() {
        return year;
    }
    public void setSid(Integer sid) {
        this.sid = sid;
    }
    public Integer getSid() {
        return sid;
    }
}
