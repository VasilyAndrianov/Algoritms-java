package lesson_7;

public class Main{
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addEdge(1, 2);
        graph.addEdge(0, 2);
        graph.addEdge(6, 4);
        graph.addEdge(5, 6);
        graph.addEdge(6, 7);
        graph.addEdge(4, 2);
        graph.addEdge(9, 3);
        graph.addEdge(7, 8);
        graph.addEdge(8, 9);
        graph.addEdge(9, 1);

//        System.out.println(graph.getVertexCount());
//        System.out.println(graph.getEdgeCount());
//        System.out.println(graph.getAdjList(4));

//        DepthFirstPath dfp = new DepthFirstPath(graph, 2);
//        System.out.println(dfp.hasPathTo(0));
//        System.out.println(dfp.pathTo(0));

        BreadthFirstPath bfp1 = new BreadthFirstPath(graph, 0);
        System.out.println(bfp1.pathTo(8));
        BreadthFirstPath bfp2 = new BreadthFirstPath(graph, 9);
        System.out.println(bfp2.pathTo(6));

    }
}
