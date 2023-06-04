package structuralPatterns.composite.shapes;

import java.awt.Graphics;

/*
 * Composite design pattern example from https://refactoring.guru/design-patterns/composite/java/example
 */
public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelected();
    void paint(Graphics graphics);
}
