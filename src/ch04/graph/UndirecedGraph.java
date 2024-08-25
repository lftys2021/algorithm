package ch04.graph;

public class UndirecedGraph {
    private int count;
    private int[][] vertexMartrix;

    public UndirecedGraph(int count){
        this.count = count;
        vertexMartrix = new int[count][count];
    }

    public void addEdges(int from, int to, int weight){
        vertexMartrix[from][to] = weight;
        vertexMartrix[to][from] = weight;
    }

    public int[][] getMatrix(){
        return vertexMartrix;
    }
}
