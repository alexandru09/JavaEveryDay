package structuralPatterns.flyweight.forest;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import structuralPatterns.flyweight.trees.Tree;
import structuralPatterns.flyweight.trees.TreeFactory;
import structuralPatterns.flyweight.trees.TreeType;

/*
 * https://refactoring.guru/design-patterns/flyweight/java/example#example-0
 */
public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}
