import java.util.*;

class Alien_Dictionary {
    public static void main(String[] args) {
        String[] temp = {"baa" , "abcd" , "abca" , "cab" , "cad"};

        findOrder(temp, 4);
    }

    static String findOrder(String[] dict, int k) {
        int n = dict.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < k; i++) {
            adj.add(new ArrayList<>());
        }

        // Build the graph
        for (int i = 0; i < n - 1; i++) {
            String str1 = dict[i];
            String str2 = dict[i + 1];
            int len = Math.min(str1.length(), str2.length());
            

            for (int j = 0; j < len; j++) {
                char first = str1.charAt(j);
                char second = str2.charAt(j);
                if (first != second) {
                    adj.get(first - 'a').add(second - 'a');
                    break; // Only the first differing character matters
                }
            }
        }

        // Perform topological sort
        boolean[] vis = new boolean[k];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < k; i++) {
            if (!vis[i]) {
                dfs(adj , i , vis , st);
            }
        }

        // Build the result from the stack
        String ans = "";
        while (!st.isEmpty()) {
            ans += (char)(st.pop()+'a');
        }
        
        System.out.println(ans);
        return ans;
    }
    static void dfs(ArrayList<ArrayList<Integer>>adj , int start , boolean []vis , Stack<Integer> ans){
        
        vis[start] = true;
        
        for(int neighbour : adj.get(start)){
            if(!vis[neighbour]){
                dfs(adj , neighbour , vis , ans);
            }
        }
        ans.push(start);
    }
}