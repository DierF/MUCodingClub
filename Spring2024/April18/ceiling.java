import java.util.Scanner;
import java.util.HashSet;

public class ceiling {
    public static class Tree {
        private int[] nodes;
        private String representation;

        public Tree(int maxLayers) {
            nodes = new int[1 << maxLayers + 1];
            representation = "";
        }

        private boolean leafFinder(int index) {
            if (index < 0 || index > nodes.length || nodes[index] == 0) return true;
            boolean left = leafFinder(2*index);
            boolean right = leafFinder(2*index + 1);
            if (left && right)
            {
                representation += index + " ";
            }
            return false;
        }

        public String getTreeRepresentation() {
            representation = "";
            leafFinder(1);
            return representation;
        }

        public void insert(int value) {
            int index = 1;
            while (nodes[index] != 0) {
                index = 2*index + (value > nodes[index]?1:0);
            }
            nodes[index] = value;
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int k = console.nextInt();
        HashSet<String> treeShapes = new HashSet<String>();
        for (int i = 0; i < n; ++i) {
            Tree current = new Tree(k);
            for (int j = 0; j < k; ++j)
            {
                current.insert(console.nextInt());
            }
            treeShapes.add(current.getTreeRepresentation());
        }
        console.close();
        System.out.println(treeShapes.size());
    }
}