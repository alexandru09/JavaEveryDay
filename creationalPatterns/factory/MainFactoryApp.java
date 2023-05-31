package creationalPatterns.factory;

import creationalPatterns.factory.dialog.Dialog;
import creationalPatterns.factory.dialog.HtmlDialog;
import creationalPatterns.factory.dialog.WindowsDialog;

/*
 * https://refactoring.guru/design-patterns/factory-method/java/example
 */
public class MainFactoryApp {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
