import java.util.ArrayList;
import java.util.List;

public class Node {
    private int depth;
    private int height;
    private int width;
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

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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
        return "Node{" +
                "depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                ", color=" + color +
                ", value=" + value +
                '}';
    }
}
