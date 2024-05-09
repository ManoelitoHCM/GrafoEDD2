import main.java.grafo.core.Graph;
import main.java.grafo.core.Node;

public class Main {
    public static void main(String[] args) throws Exception {
        Graph graph = new Graph();

        graph.addNode("RJ");
        graph.addNode("SP");
        graph.addNode("BH");
        graph.addNode("PT");
        graph.addNode("OS");
        graph.addNode("SV");
        graph.addNode("CR");
        graph.addNode("PA");


        System.out.println("O grafo G possui os seguintes vértices:");
        System.out.println();

        for (Node node : graph.getNodes()) {
            System.out.println("- Vertice " + node.getLabel());
        }
    }
}