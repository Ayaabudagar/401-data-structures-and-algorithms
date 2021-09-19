package graph;

import java.util.Objects;

public class Node {
    String label;
    public int weight;

    Node(String label){
        this.label = label;
    }

    Node(String label, int weight){
        this.label = label;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node vertex = (Node) o;
        return Objects.equals(label, vertex.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "label='" + label + '\'' +
                '}';
    }
}