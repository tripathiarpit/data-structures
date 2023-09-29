package graph;

import java.util.*;
/*
Byteland has n
 cities, and m
 roads between them. The goal is to construct new roads so that there is a route between any two cities.

Your task is to find out the minimum number of roads required, and also determine which roads should be built.

Input

The first input line has two integers n
 and m
: the number of cities and roads. The cities are numbered 1,2,…,n
.

After that, there are m
 lines describing the roads. Each line has two integers a
 and b
: there is a road between those cities.

A road always connects two different cities, and there is at most one road between any two cities.

Output

First print an integer k
: the number of required roads.

Then, print k
 lines that describe the new roads. You can print any valid solution.

Constraints
1≤n≤105

1≤m≤2⋅105

1≤a,b≤n

Example

Input:
4 2
1 2
3 4

Output:
1
2 3
 */
public class SolutionToPath {
    static final int N = (int) 1e5 + 1;
    static ArrayList<Integer>[] g = new ArrayList[N];
    static boolean[] vis = new boolean[N];

    public static void dfs(int s) {
        vis[s] = true;
        for (int e : g[s]) {
            if (!vis[e]) {
                dfs(e);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Cities");
        int n = scanner.nextInt();
        System.out.println("Enter the number of Roads");
        int m = scanner.nextInt();

        // Initialize the graph
        for (int i = 0; i < N; i++) {
            g[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            System.out.println("Enter the City 1");
            int x = scanner.nextInt();
            System.out.println("Enter the City 2");
            int y = scanner.nextInt();
            g[x].add(y);
            g[y].add(x);
        }
        int cc = 0;
        ArrayList<Integer> t = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!vis[i]) {
                dfs(i);
                t.add(i);
                cc++;
            }
        }
        System.out.println(cc - 1);
        for (int i = 0; i < t.size() - 1; i++) {
            System.out.println(t.get(i) + " " + t.get(i + 1));
        }

        scanner.close();
    }
}
