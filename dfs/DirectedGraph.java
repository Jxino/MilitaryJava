package dfs;

class DirectedGraph {
    static int[][] graph = {
        {0, 1, 1, 0}, 
        {1, 0, 0, 1}, 
        {1, 1, 1, 1}, 
        {0, 0, 0, 0}
    };

    static boolean[] visited = new boolean[4];

    public static void dfs(int vertex) {
        visited[vertex] = true;
        for (int i = 0; i < graph[vertex].length; i++) {
            System.out.println(String.format("vertex: %d | neighboring vertex: %d checked", vertex, i));
            if (graph[vertex][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Dfs start");
        dfs(0);
        System.out.println("Dfs end");
    }
}