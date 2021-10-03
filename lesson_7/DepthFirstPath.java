package lesson_7;

import java.util.LinkedList;

public class DepthFirstPath extends algorithmsGraph {
    private boolean[] marked;
    private int[] edgeTo;
    private int source;

    public DepthFirstPath(Graph g, int source) {
        this.source = source;
        edgeTo = new int[g.getVertexCount()];
        marked = new boolean[g.getVertexCount()];
        dfs(g, source);
    }

    @Override
    void bfs(Graph g, int source) {
    }

    @Override
    public boolean hasPathTo(int dist) {
        return marked[dist];
    }

    @Override
    public LinkedList<Integer> pathTo(int dist) {
        if (!hasPathTo(dist)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = dist;
        while (vertex != source) {
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }


    @Override
    void dfs(Graph g, int v) {
        marked[v] = true;
        for (int w : g.getAdjList(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                dfs(g, w);
            }
        }
    }

}
