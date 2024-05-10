public class ColorScaler {
    public void scaleColor(Graph graph) {
        double maxColor = 0;
        for (Node node : graph.getNodes()) {
            if (node.getColor() > maxColor) {
                maxColor = node.getColor();
            }
        }

        for (Node node : graph.getNodes()) {
            node.setColor(node.getColor() / maxColor);
        }
    }
}
