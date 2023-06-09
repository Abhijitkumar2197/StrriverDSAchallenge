import java.util.* ;
import java.io.*; 

public class Solution {

    // minHeap function which take size of Queries and Queries as Input.
// Returns an array out outputs depending on the query.
    static int[] minHeap(int n, int[][] q) {
        PriorityQueue<Integer> pq  = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < q.length; i++){
            if(q[i][0] == 0){
                pq.add(q[i][1]);
            }else{
                list.add(pq.poll());
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < ans.length ;i++){
            ans[i] = list.get(i);
        }
        return ans;

    }
}
