package creationalPatterns.factory.dialog;

import creationalPatterns.factory.button.Button;
import creationalPatterns.factory.button.WindowsButton;

/*
 * https://refactoring.guru/design-patterns/factory-method/java/example
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    
}
