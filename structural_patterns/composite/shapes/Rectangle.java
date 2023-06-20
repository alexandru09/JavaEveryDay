package structural_patterns.composite.shapes;

import java.awt.Color;
import java.awt.Graphics;

/*
 * Composite design pattern example from https://refactoring.guru/design-patterns/composite/java/example
 */
public class Rectangle extends BaseShape {
    public int width;
    public int height;

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawRect(x, y, getWidth()-1, getHeight()-1);
    }
}
