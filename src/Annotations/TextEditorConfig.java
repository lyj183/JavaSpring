package Annotations;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/13 17:00
 * @Description:
 **/

// 5.5.2 注入 Bean 的依赖性
import org.springframework.context.annotation.*;
@Configuration
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor(){
        return new TextEditor(spellChecker());
    }
    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker( );
    }
}
