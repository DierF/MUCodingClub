import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class buriedtreasure2
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int m = console.nextInt();

        // Note: all numbers are shifted right by m (+m)
        //         so that we can use index-based ArrayList
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(2 * m + 1);
        for (int i = 0; i <= 2 * m; i++)
        {
            graph.add(new ArrayList<>());
        }

        // graph for reversed dfs
        ArrayList<ArrayList<Integer>> reversed_graph = new ArrayList<>(2 * m + 1);
        for (int i = 0; i <= 2 * m; i++)
        {
            reversed_graph.add(new ArrayList<>());
        }

        build_graphs(console, n, m, graph, reversed_graph);

        ArrayList<HashSet<Integer>> scc = find_scc(graph, reversed_graph);
        // if x and ~x are in the same strongly connected component, then no solution
        for (HashSet<Integer> component : scc)
        {
            for (Integer x : component)
            {
                // Note: exclude the 0 case
                if (x != m && component.contains(-(x - m) + m))
                {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }

    public static void build_graphs(Scanner console, int n, int m,
                                    ArrayList<ArrayList<Integer>> graph,
                                    ArrayList<ArrayList<Integer>> reversed_graph
                                    )
    {
        for (int i = 0; i < n; i++)
        {
            int a = console.nextInt();
            int b = console.nextInt();

            // (A or B) <=> (~A => B and ~B => A)
            graph.get(-a + m).add(b + m);
            graph.get(-b + m).add(a + m);

            reversed_graph.get(b + m).add(-a + m);
            reversed_graph.get(a + m).add(-b + m);
        }
    }

    public static ArrayList<HashSet<Integer>> find_scc(ArrayList<ArrayList<Integer>> graph,
                                                       ArrayList<ArrayList<Integer>> reversed_graph)
    {
        // Kosaraju's algorithm to find the strongly connected components
        // 1. find the order using dfs based on finish time
        ArrayList<Integer> order = new ArrayList<>();
        boolean[] visited = new boolean[graph.size()];
        for (int i = 0; i < graph.size(); i++)
        {
            if (!visited[i])
            {
                visited[i] = true;

                dfs(graph, visited, order, i);
            }
        }

        // 2. find strongly connected components using reversed dfs based on the order
        // Note: Any nodes that can be reached are in the same scc as the source node
        ArrayList<HashSet<Integer>> scc = new ArrayList<>();
        visited = new boolean[graph.size()];
        for (Integer x : order.reversed())
        {
            if (!visited[x])
            {
                visited[x] = true;

                scc.add(new HashSet<>());
                reversed_dfs(reversed_graph, visited, scc, x);
            }
        }

        return scc;
    }

    public static void dfs(ArrayList<ArrayList<Integer>> graph,
                           boolean[] visited,
                           ArrayList<Integer> order,
                           int current)
    {
        for (Integer next : graph.get(current))
        {
            if (visited[next])
            {
                continue;
            }
            visited[next] = true;

            dfs(graph, visited, order, next);
        }

        order.add(current);
    }

    public static void reversed_dfs(ArrayList<ArrayList<Integer>> reversed_graph,
                                    boolean[] visited,
                                    ArrayList<HashSet<Integer>> scc,
                                    int current)
    {
        scc.getLast().add(current);
        for (Integer next : reversed_graph.get(current))
        {
            if (visited[next])
            {
                continue;
            }
            visited[next] = true;

            reversed_dfs(reversed_graph, visited, scc, next);
        }
    }
}
