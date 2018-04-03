public class MergeSort {
  
  public static void mergeSort(int[] array){
    mergeSort(array, new int[aray.length], 0, array.length - 1);
    
  }
  
  public static void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd){
    if(leftStart < rightEnd) {
      int mid = (left + right) / 2;
      mergeSort(array, temp, leftStart, mid);
      mergeSort(array, temp, mid+1, rightEnd);
      mergeHalves(array, temp, leftStart, rightEnd)
    }
  }
  
  public void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
    int leftEnd = (leftStart + rightEnd)/2;
    int rightStart = leftEnd + 1;
    int size = rightEnd - leftStart + 1;
    
    int left = leftStart;
    int right = rightStart;
    int index = leftStart;
    
    while(left <= leftEnd && right <= rightEnd) {
      if(left<=right){
        temp[index] = array[left];
        left++;
      } else {
        temp[index] = array[right];
        right++;
      }
      index++;
    }
    
    while(left <= leftEnd){
      temp[index] = array[left];
      index++;
      left++;
    }
    
    
    while(right <= rightEnd){
      temp[index] = array[right];
      index++;
      right++;
    }
  }
}
