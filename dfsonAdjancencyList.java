import java.util.*;

public class BFS {

    public void bfsTraversal(ArrayList<ArrayList<Integer>> adj, int startNode) {
        int n = adj.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        visited[startNode] = true;
        queue.add(startNode);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.println(node);

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int numNodes = 5;

        for (int i = 0; i < numNodes; i++) {
            adj.add(new ArrayList<>());
        }

        // Creating the graph
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(1).add(3);
        adj.get(3).add(1);
        adj.get(2).add(4);
        adj.get(4).add(2);

        BFS bfsObj = new BFS();
        bfsObj.bfsTraversal(adj, 0);
    }
}
