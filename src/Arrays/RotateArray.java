//Rotate an array of n elements to the right by k steps.

/*
For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. 
How many different ways do you know to solve this problem?
*/

public class RotateArray

  //Space is O(n) and time is O(n).
  public void rotate(int[] nums, int k) {
      if(k > nums.length) 
          k=k%nums.length;

      int[] result = new int[nums.length];

      for(int i=0; i < k; i++){
          result[i] = nums[nums.length-k+i];
      }

      int j=0;
      for(int i=k; i<nums.length; i++){
          result[i] = nums[j];
          j++;
      }

      System.arraycopy( result, 0, nums, 0, nums.length );
  }
  
  //Solution 2 - Reversal

/*Can we do this in O(1) space and in O(n) time? The following solution does.

  Assuming we are given {1,2,3,4,5,6} and order 2. The basic idea is:

  1. Divide the array two parts: 1,2,3,4 and 5, 6
  2. Reverse first part: 4,3,2,1,5,6
  3. Reverse second part: 4,3,2,1,6,5
  4. Reverse the whole array: 5,6,1,2,3,4
*/  
  
  public void rotate(int arr[], int k) {
    if(arr.length == 0 || arr == null || k < 0 ) {
      throw new IllegalArgumentException("Illegal Argument");
    }
    
    k = k % arr.length;
    b = arr.length;
    int a = b - k;
    reverse(arr, 0, a - 1);
    reverse(arr, a, b - 1);
    reverse(arr, 0, b - 1);
  }
  
  public void reverse(int[] a, int i, int j) {
    if( a.length == 1 ) return;
    
    while (i < j) {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
      i++;
      j--
    }
}

