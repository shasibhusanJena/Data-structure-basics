package practiceExamples;

import java.util.Arrays;

// Given an unsorted array of integers , find the length of longest consecutive elements sequence
public class Array_LengthConselementsSeq {
	
public static void main(String[] args) {
	
	 int arr[] = {0,1,1,1,1,1,2,3};
     int N = arr.length;
      
     if(N == 1){
       System.out.println("Longest Consecutive subsequence: 1");
         return;
     }
      
       Arrays.sort(arr);
       int count = 1;
       int max_count = -1;
       for(int i=0; i < N-1; i++)
       {
           if(arr[i+1] - arr[i] == 1)
           {
               count++;
           }
           else if(arr[i+1] - arr[i] == 0)
           {
               continue;
           }
           else
           {
               count = 1;
           }
           max_count = Math.max(max_count, count);
       }
     System.out.println("Longest Consecutive subsequence: "+max_count);
   }
}

