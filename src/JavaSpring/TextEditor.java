package JavaSpring;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/13 10:42
 * @Description: 3、Spring 依赖注入；4、Spring Beans 自动装配
 **/
// 3、Spring 依赖注入
// 3.1、Spring 基于构造函数的依赖注入
/*
public class TextEditor {
    private SpellChecker spellChecker;
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
*/

// 3.2、Spring 基于设值函数的依赖注入
// 3.3、Spring 注入内部 Beans
/*
public class TextEditor {
    private SpellChecker spellChecker;
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker." );
        this.spellChecker = spellChecker;
    }
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
*/

// 4、Spring Beans 自动装配
// 4.1、Spring 自动装配 'byName'
// 4.2、Spring 自动装配 'byType'
/*
public class TextEditor {
    private SpellChecker spellChecker;
    private String name;
    public void setSpellChecker( SpellChecker spellChecker ){
        this.spellChecker = spellChecker;
    }
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
*/

// 4.3、Spring 由构造函数自动装配
public class TextEditor{
    private SpellChecker spellChecker;
    private String name;
    public TextEditor( SpellChecker spellChecker, String name ) {
        this.spellChecker = spellChecker;
        this.name = name;
    }
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public String getName() {
        return name;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
