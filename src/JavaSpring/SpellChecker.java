package JavaSpring;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/13 10:44
 * @Description: 3、Spring 依赖注入；4、Spring Beans 自动装配
 **/

// 3、Spring 依赖注入
// 3.1、Spring 基于构造函数的依赖注入
// 3.2、Spring 基于设值函数的依赖注入
// 3.3、Spring 注入内部 Beans
// 4、Spring Beans 自动装配
// 4.1、Spring 自动装配 'byName'
// 4.2、Spring 自动装配 'byType'
// 4.3、Spring 由构造函数自动装配
public class SpellChecker {
    public SpellChecker() {
        System.out.println("Inside SpellChecker constructor.");
    }
    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
    }
}
