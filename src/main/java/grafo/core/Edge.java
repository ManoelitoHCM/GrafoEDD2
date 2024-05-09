package main.java.grafo.core;

public class Edge {

    private Node node;

    public Edge(Node node) throws Exception {
        boolean isNodeNullOrBlank = node == null || node != null && node.getLabel().trim().isEmpty();

        if(isNodeNullOrBlank) {
            throw new Exception("Não é permitida a inclusão de arestas em nós nulos.");
        }
        this.node = node;
    }

    public Edge getIncidentEdges(Node node){

    }
}

/*


    public String getLabel(){
        return this.label;
    }

    public void addDegree() {
        degree++;
    }

    public int getDegree(){
        return degree;
    }
}
*/