package Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private final Map<String, Tree> treeMap = new HashMap<>();

    public Tree getTree(String shape, String color) {
        String key = shape + "-" + color;

        if (!treeMap.containsKey(key)) {
            treeMap.put(key, new OakTree(shape, color));
        }

        return treeMap.get(key);
    }
}
