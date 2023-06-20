package structural_patterns.flyweight.trees;

import java.awt.*;

/*
 * Unique state of each tree
 * https://refactoring.guru/design-patterns/flyweight/java/example#example-0
 */
public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
    
}
