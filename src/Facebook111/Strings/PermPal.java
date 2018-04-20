public class PermPal {
    public static void main(String args[]) {
       String s = "f";
       MyClass myAss = new MyClass();
       boolean  value = myAss.isPermuationOfPalindrome(s);
       
       System.out.println("Value: "+value);
    }
    
    public boolean isPermuationOfPalindrome(String s) {
        if (s == null ) return true;
  
        int[] arr =  new int[128];
  
        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i);
            arr[value]++;
        }
        
        int oddcount = 0;
        for(int i = 0; i < arr.length; i++) {
            //System.out.println("Value of "+arr[i]);
            if(arr[i] % 2 == 1) {
               oddcount++;
            }
            if(oddcount > 1) return false;
        
            
        }
        return true;
    }
    
}
