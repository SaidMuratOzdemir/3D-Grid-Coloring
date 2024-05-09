import java.util.ArrayList;
import java.util.List;

public class Graph {
    private final List<Node> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public void addNode(Node node) {
        this.nodes.add(node);
    }
    public List<Node> getNodes() {
        return nodes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int rowCounter = 0;
        for (Node node : nodes) {
            if (rowCounter != node.getRowID()) {
                sb.append("\n");
                rowCounter = node.getRowID();
            }
            sb.append(node).append(" ");
        }
        return sb.toString();
    }
}
