package main.java.grafo.core;

public class Node {
    private String label;
    private int degree;

    public Node(String label) throws Exception {
        boolean isLabelNullOrBlank = label == null || label != null && label.trim().isEmpty();

        if(isLabelNullOrBlank) {
            throw new Exception("Não é permitida a inclusão de nós/vértices com rótulo em branco.");
        }
        this.label = label;
    }

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
