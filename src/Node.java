import java.util.ArrayList;
import java.util.List;

public class Node {
    private final char value;
    private final int rowID;
    private final List<Node> neighbors;
    private int color;

    public Node(char value, int rowID, ArrayList<Node> neighbors) {
        this.rowID = rowID;
        this.neighbors = neighbors;
        this.value = value;
        this.color = 0;
    }

    public char getValue() {
        return value;
    }

    public int getRowID() {
        return rowID;
    }

    public List<Node> getNeighbors() {
        return neighbors;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" +
                "value=" + getValue() +
                ", color=" + getColor() +
                '}';
    }
}
