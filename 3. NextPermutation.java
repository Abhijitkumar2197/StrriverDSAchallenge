import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

 class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		int len = permutation.size();
        int i = len - 2;
        Stack<Integer> s = new Stack<>();
        s.add(len - 1);
        for(; i>= 0; i--){
            int index = -1;
            if(permutation.get(i) > permutation.get(s.peek())) s.push(i);

            else{
                int j = i;
                while(!s.isEmpty() && j >= 0 && permutation.get(j) < permutation.get(s.peek())){
                    index = s.pop();
                }
                if(index == -1 ) continue;
                int temp = permutation.get(i);
                permutation.set(i,permutation.get(index));
                permutation.set(index,temp);
                reverseArray(permutation,i + 1,len - 1);
                return permutation;
            }
        }
        if(i == -1){
            Collections.reverse(permutation);
        }
        return permutation;
	}
	public  static void reverseArray(ArrayList<Integer> permutation , int i , int j){
       while(i < j){
           int temp = permutation.get(j);
           permutation.set(j,permutation.get(i));
           permutation.set(i,temp);
		   i++;
		   j--;
       }
    }
}
