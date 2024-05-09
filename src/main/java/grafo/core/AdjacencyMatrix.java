package main.java.grafo.core;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyMatrix {
    private int[][] matrix;
    private List<Node> nodes;
    private int nodeCount;

    public AdjacencyMatrix(List<Node> nodes) {
        this.nodes = nodes;
        this.nodeCount = nodes.size();

        matrix = new int[nodeCount][nodeCount];

        matrixInit();
    }

    private void matrixInit() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public void addEdge(int sourceNodeIndex, int destinationNodeIndex) {
        Node firstNode = nodes.get(sourceNodeIndex);
        Node lastNode = nodes.get(destinationNodeIndex);
        if (sourceNodeIndex == destinationNodeIndex) {
            matrix[sourceNodeIndex][sourceNodeIndex] = 1;
            firstNode.addDegree();
        }
    }

    public List<Node> getAdjacencies(int nodeIndex) {
        List<Node> adjacencies = new ArrayList<>();
        for (int j = 0; j < nodes.size(); j++) {
            if (matrix[nodeIndex][j] == 1) {
                Node node = nodes.get(j);
                adjacencies.add(node);
            }
        }
        return adjacencies;
    }
}
