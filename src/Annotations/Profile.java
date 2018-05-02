package Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/13 15:11
 * @Description:
 **/

public class Profile {
    @Autowired
    @Qualifier("student2")
    private Student student;
    public Profile(){
        System.out.println("Inside Profile constructor." );
    }
    public void printAge() {
        System.out.println("Age : " + student.getAge() );
    }
    public void printName() {
        System.out.println("Name : " + student.getName() );
    }
}
