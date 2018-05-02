package Annotations;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/13 14:30
 * @Description:
 **/

// 5.2、Spring @Autowired 注释
// 5.2.1、属性中的 @Autowired
// 5.2.2、构造函数中的 @Autowired
// 5.4.2、@Resource 注释
// 5.5.2 注入 Bean 的依赖性
public class SpellChecker {
    public SpellChecker(){
        System.out.println("Inside SpellChecker constructor." );
    }
    public void checkSpelling(){
        System.out.println("Inside checkSpelling." );
    }
}
