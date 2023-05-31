package creationalPatterns.factory.button;

/*
 * https://refactoring.guru/design-patterns/factory-method/java/example
 */
public class HtmlButton implements Button {
    
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Hello World!");
    }
}
