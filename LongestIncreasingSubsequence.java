package Lis;

public class LongestIncreasingSubsequence {
	static int incre_subseq(int my_arr[], int arr_len){
	      int seq_arr[] = new int[arr_len];
	      int i, j, max = 0;
	      for (i = 0; i < arr_len; i++)
	         seq_arr[i] = 1;
	      for (i = 1; i < arr_len; i++)
	      for (j = 0; j < i; j++)
	      if (my_arr[i] > my_arr[j] && seq_arr[i] < seq_arr[j] + 1)
	      seq_arr[i] = seq_arr[j] + 1;
	      for (i = 0; i < arr_len; i++)
	      if (max < seq_arr[i])
	      max = seq_arr[i];
	      return max;
	   }
	   public static void main(String args[]){
	      //int my_arr[] = { 75, 83, 48, 50, 100, 56, 97 , 108, 70, 91};
		   int my_arr[]= {3,10,2,1,20};
	      int arr_len = my_arr.length;
	      System.out.println("The length of the Longest Increasing Subsequence is " +  incre_subseq(my_arr, arr_len));
	   }
}


