import java.util.*;

class Graph {
    private int V;
    private LinkedList<Integer> adj[];

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    boolean isReachable(int source, int dest) {
        // Mark all the vertices as not visited
        boolean[] visited = new boolean[V];

        // Call the recursive helper function to check if there is a path
        return isReachableUtil(source, dest, visited);
    }

    // Recursive helper function to check if there is a path
    private boolean isReachableUtil(int v, int dest, boolean[] visited) {
        // Mark the current vertex as visited
        visited[v] = true;

        // If the current vertex is the destination, there is a path
        if (v == dest) {
            return true;
        }

        // Recur for all adjacent vertices
        for (Integer neighbor : adj[v]) {
            if (!visited[neighbor] && isReachableUtil(neighbor, dest, visited)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        int n = 4;
        Graph g = new Graph(n);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=n;i++){
			int x=sc.nextInt();
		    int y=sc.nextInt();
			g.addEdge(x,y);
		}
        /*g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
		*/
        int source = 0;
        int destination = 3;

        if (g.isReachable(source, destination)) {
            System.out.println("There is a path from " + source + " to " + destination);
        } else {
            System.out.println("There is no path from " + source + " to " + destination);
        }
    }
}
