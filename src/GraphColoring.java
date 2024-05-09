public class GraphColoring {

    private static int lastColor = 0;

    public static void main(String[] args) {

        char[][] array = {{'a', 'b', 'b', 'c', 'e'}, {'c', 'e', 'b', 'a', 'a'}, {'c', 'c', 'c', 'b', 'a'}};

        Graph graph = Converter.convert(array);
        GraphColoring graphColoring = new GraphColoring();
        graphColoring.colorGraphIterative(graph);
        System.out.println(graph);

    }

    public void colorGraphIterative(Graph graph) {
        for (Node node : graph.getNodes()) {
            if (node.getColor() == 0) {
                for (Node neighbor : node.getNeighbors()) {
                    if (neighbor.getColor() != 0 && neighbor.getValue() == node.getValue()) {
                        node.setColor(neighbor.getColor());
                    }
                }

                if (node.getColor() == 0) {
                    lastColor++;
                    node.setColor(lastColor);
                }
            }
        }

        lastColor = 0;
    }
}