package structural_patterns.flyweight.trees;

import java.awt.*;

/*
 * State shared by multiple trees
 * https://refactoring.guru/design-patterns/flyweight/java/example#example-0
 */
public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval( - 5, y - 10, 10, 10);
    }
}
