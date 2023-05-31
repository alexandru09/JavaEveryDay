package creationalPatterns.factory.dialog;

import creationalPatterns.factory.button.Button;

/*
 * https://refactoring.guru/design-patterns/factory-method/java/example
 */
public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
