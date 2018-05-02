package Annotations;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/18 09:45
 * @Description:
 **/

// 6、Spring 框架的 AOP (Annotations 包)
// 6.1 Spring 中基于 AOP 的 XML架构
/*
public class Logging {
    public void beforeAdvice(){
        System.out.println("Going to setup student profile.");
    }
    public void afterAdvice(){
        System.out.println("Student profile has been setup.");
    }
    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning:" + retVal.toString() );
    }
    public void AfterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception: " + ex.toString());
    }
}
*/

// 6.2 Spring 中基于 AOP 的 @AspectJ
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
@Aspect
public class Logging {
    @Pointcut("execution(* Annotations.*.*(..))")
    private void selectAll() {

    }
    @Before("selectAll()")
    public void beforeAdvice() {
        System.out.println("Going to setup student profile.");
    }
    @After("selectAll()")
    public void afterAdvice() {
        System.out.println("Student profile has been setup.");
    }
    @AfterReturning(pointcut = "selectAll()", returning="retVal")
    public void afterReturningAdvice(Object retVal) {
        System.out.println("Returning:" + retVal.toString() );
    }
    @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
    public void AfterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("There has been an exception: " + ex.toString());
    }
}