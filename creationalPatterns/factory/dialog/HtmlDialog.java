package creationalPatterns.factory.dialog;

import creationalPatterns.factory.button.Button;
import creationalPatterns.factory.button.HtmlButton;

/*
 * https://refactoring.guru/design-patterns/factory-method/java/example
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
    
}
