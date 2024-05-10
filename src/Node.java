import java.util.ArrayList;
import java.util.List;

public class Node {
    private final int depth;
    private final int height;
    private final int width;
    private double color;
    private final char value;
    private final List<Node> neighbors;

    public Node(int depth, int height, int width, char value, ArrayList<Node> neighbors) {
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.neighbors = neighbors;
        this.value = value;
        this.color = 0;
    }

    public double getColor() {
        return color;
    }

    public void setColor(double color) {
        this.color = color;
    }

    public char getValue() {
        return value;
    }

    public List<Node> getNeighbors() {
        return neighbors;
    }

    @Override
    public String toString() {
        return depth + "," + height + "," + width + "," + color + "," + (int)value;
    }
}
