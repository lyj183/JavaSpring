package SpringJDBC;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/18 11:12
 * @Description:
 **/

// 7、 Spring JDBC 框架
// 7.1 Spring JDBC 示例
// 7.2、Spring 中 SQL 的存储过程 (按照例子未成功)
public class Student {
    private Integer age;
    private String name;
    private Integer id;
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
}