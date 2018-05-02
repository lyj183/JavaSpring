package Annotations;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/13 14:30
 * @Description:
 **/

// 5.2、Spring @Autowired 注释
/*
import org.springframework.beans.factory.annotation.Autowired;
public class TextEditor {
    private SpellChecker spellChecker;
    @Autowired
    public void setSpellChecker( SpellChecker spellChecker ){
        this.spellChecker = spellChecker;
    }
    public SpellChecker getSpellChecker( ) {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
*/

// 5.2.1、属性中的 @Autowired
/*
import org.springframework.beans.factory.annotation.Autowired;
public class TextEditor {
    @Autowired
    private SpellChecker spellChecker;
    public TextEditor() {
        System.out.println("Inside TextEditor constructor." );
    }
    public SpellChecker getSpellChecker( ){
        return spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
*/

// 5.2.2、构造函数中的 @Autowired
/*
import org.springframework.beans.factory.annotation.Autowired;
public class TextEditor {
    private SpellChecker spellChecker;
    @Autowired
    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
*/

// 5.4.2、@Resource 注释
/*
import javax.annotation.Resource;
public class TextEditor {
    private SpellChecker spellChecker;
    @Resource(name= "spellChecker")
    public void setSpellChecker( SpellChecker spellChecker ){
        this.spellChecker = spellChecker;
    }
    public SpellChecker getSpellChecker(){
        return spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
*/

// 5.5.2 注入 Bean 的依赖性
public class TextEditor {
    private SpellChecker spellChecker;
    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}