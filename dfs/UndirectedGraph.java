package dfs;

class UndirectedGraph {
    static int[][] graph = {
        {0, 1, 1, 0}, 
        {1, 0, 0, 1}, 
        {1, 0, 0, 1}, 
        {0, 1, 1, 0}
    };

    static boolean[] visited = new boolean[4];

    public static void dfs(int vertex) {
        visited[vertex] = true;
        for (int i = 0; i < graph[vertex].length ; i++) {
            System.out.println(String.format("vertex: %d | neighboring vertex: %d checked", vertex, i));
            if (graph[vertex][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    public static boolean allVisited() {
        for (boolean v : visited) {
            if (!v) {
                return false;
            }
        }
        return true;
    }

    public static void startDfs() {
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                dfs(i);
                if (allVisited()) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Dfs start");
        startDfs();
        System.out.println("Dfs end");
    }
}