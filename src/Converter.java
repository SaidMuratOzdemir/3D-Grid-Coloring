import java.util.ArrayList;

public class Converter {


    public static Graph convert(char[][] array) {
        Graph graph = new Graph();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                ArrayList<Node> neighbours = new ArrayList<>();
                Node node = new Node((array[i][j]), i, neighbours);
                graph.addNode(node);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Node node = graph.getNodes().get(i * array[i].length + j);
                if (i - 1 >= 0) {
                    node.getNeighbors().add(graph.getNodes().get((i - 1) * array[i].length + j));
                }
                if (j - 1 >= 0) {
                    node.getNeighbors().add(graph.getNodes().get(i * array[i].length + j - 1));
                }
                if (j + 1 < array[i].length) {
                    node.getNeighbors().add(graph.getNodes().get(i * array[i].length + j + 1));
                }
                if (i + 1 < array.length) {
                    node.getNeighbors().add(graph.getNodes().get((i + 1) * array[i].length + j));
                }

            }
        }
        return graph;
    }
}
