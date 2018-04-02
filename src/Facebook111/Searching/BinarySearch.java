// Java implementation of recursive Binary Search
class BinarySearch
{
    public int performBS(int low, int high, int a[], int item){
        if(low<=high) {
            
            int mid = low + (high - low) / 2;
            
            if(item == a[mid]) 
                return mid;
                
            else if (item < a[mid]) 
                return performBS(low, mid-1, a, item);
        
            return performBS(mid+1, high, a, item);
            
        }
        return -1;
    }
	public static void main(String[] args) {
	    BinarySearch binarySearch = new BinarySearch();
	    int arr[] = {0,2,3,5,8,9,10};
	    int l = arr.length;
	    int n = binarySearch.performBS(0,l-1, arr, 1);
	    System.out.println(n+"");
	}
