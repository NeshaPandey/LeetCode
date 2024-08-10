class RegionsCutBySlashes {
    public int regionsBySlashes(String[] grid) {
         int n = grid.length;
        int size = n * 3;
        int[][] graph = new int[size][size];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char c = grid[i].charAt(j);
                if (c == '/') {
                    graph[i * 3][j * 3 + 2] = 1;
                    graph[i * 3 + 1][j * 3 + 1] = 1;
                    graph[i * 3 + 2][j * 3] = 1;
                } else if (c == '\\') {
                    graph[i * 3][j * 3] = 1;
                    graph[i * 3 + 1][j * 3 + 1] = 1;
                    graph[i * 3 + 2][j * 3 + 2] = 1;
                }
            }
        }
        
        int regions = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (graph[i][j] == 0) {
                    dfs(graph, i, j);
                    regions++;
                }
            }
        }
        
        return regions;
    }
    
    private void dfs(int[][] graph, int i, int j) {
        int n = graph.length;
        if (i < 0 || j < 0 || i >= n || j >= n || graph[i][j] == 1) {
            return;
        }
        graph[i][j] = 1;
        dfs(graph, i + 1, j);
        dfs(graph, i - 1, j);
        dfs(graph, i, j + 1);
        dfs(graph, i, j - 1);
    }
    
}
