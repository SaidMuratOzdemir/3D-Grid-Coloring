import java.util.ArrayList;

public class Converter {

    public static Graph convert(char[][][] array) {
        Graph graph = new Graph();
        int depth = array.length;
        int height = array[0].length;
        int width = array[0][0].length;

        for (int i = 0; i < depth; i++) {
            for (int j = 0; j < height; j++) {
                for (int k = 0; k < width; k++) {
                    ArrayList<Node> neighbours = new ArrayList<>();
                    Node node = new Node(i, j, k, array[i][j][k], neighbours);
                    graph.addNode(node);
                }
            }
        }

        for (int i = 0; i < depth; i++) {
            for (int j = 0; j < height; j++) {
                for (int k = 0; k < width; k++) {
                    Node node = graph.getNodes().get(i * height * width + j * width + k);

                    if (i - 1 >= 0) {
                        node.getNeighbors().add(graph.getNodes().get((i - 1) * height * width + j * width + k));
                    }
                    if (j - 1 >= 0) {
                        node.getNeighbors().add(graph.getNodes().get(i * height * width + (j - 1) * width + k));
                    }
                    if (k - 1 >= 0) {
                        node.getNeighbors().add(graph.getNodes().get(i * height * width + j * width + (k - 1)));
                    }
                    if (i + 1 < depth) {
                        node.getNeighbors().add(graph.getNodes().get((i + 1) * height * width + j * width + k));
                    }
                    if (j + 1 < height) {
                        node.getNeighbors().add(graph.getNodes().get(i * height * width + (j + 1) * width + k));
                    }
                    if (k + 1 < width) {
                        node.getNeighbors().add(graph.getNodes().get(i * height * width + j * width + (k + 1)));
                    }
                }
            }
        }

        return graph;
    }
}
