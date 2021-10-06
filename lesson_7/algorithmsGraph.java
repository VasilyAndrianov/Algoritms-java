package lesson_7;

import java.util.LinkedList;

public abstract class algorithmsGraph {

    abstract void bfs(Graph g, int source);

    public abstract boolean hasPathTo(int dist);

    public abstract LinkedList<Integer> pathTo(int dist);

    abstract void dfs(Graph g, int v);


}
