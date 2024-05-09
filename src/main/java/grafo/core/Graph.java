package main.java.grafo.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Graph {

    private int nodeCount = 0;
    private Map<String, Integer> labelsInIndex = new HashMap<String, Integer>();
    private List<Node> nodes = new ArrayList<Node>();

    public Graph() {
    }

    public Graph(int nodeCount) {
        if (nodeCount <= 0) {
            throw new IllegalArgumentException("A quantidade mínima de nós/vértices deve ser maior ou igual a 1.");
        }
    }

    // método para adicionar nó
    public void addNode(String label) throws Exception {
        Node newNode = new Node(label);
        this.nodes.add(newNode);
        this.labelsInIndex.put(label, nodeCount);
        nodeCount++;
    }

    public List<Node> getNodes() {
        return this.nodes;
    }

    // getAdjacentNodes (Node node)
    // método para recuperar nó por label (usando o map)

    // método para adicionar aresta (addEdge)
    // getEdge (pegar arestas incidentes a nó X)
    //
}
