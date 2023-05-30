package structuralPatterns.flyweight.trees;

import java.util.HashMap;
import java.util.Map;
import java.awt.*;

/*
 * Creation of flyweight
 * https://refactoring.guru/design-patterns/flyweight/java/example#example-0
 */
public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;
    }
}
