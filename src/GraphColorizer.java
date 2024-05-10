public class GraphColorizer {

    private static int lastColor = 0;

    public void colorGraph(Graph graph) {
        for (Node node : graph.getNodes()) {
            if (node.getColor() == 0) {
                colorNodeAndNeighbors(node, ++lastColor);
            }
        }

        lastColor = 0;
    }

    private void colorNodeAndNeighbors(Node node, int color) {
        node.setColor(color);
        for (Node neighbor : node.getNeighbors()) {
            if (neighbor.getColor() == 0 && neighbor.getValue() == node.getValue()) {
                colorNodeAndNeighbors(neighbor, color);
            }
        }
    }
}