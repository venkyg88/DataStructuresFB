public class MaxSubArraySum {
  public static void main(String[] args){
      int[] a = {-2,1,3,-3,2,4,-2,6};
      System.out.println(maxSubArraySum(a));
  }
  
  public static int maxSubArraySum(int[] a) {
      int max_so_far = -100;
      int max_ending = 0;
      
      for( int i=0; i< a.length; i++){
        max_ending = max_ending + a[i];
        if( max_so_far < max_ending) max_so_far = max_ending;
        if( max_ending < 0 ) max_ending = 0;
      }
      return max_so_far;
  }
}
