public class Permutation {
    public static void main(String args[]) {
       String s = "f";
       MyClass myAss = new MyClass();
       boolean  value = myAss.isPermutation("abc", "cab");
       
       System.out.println("Value: "+value);
    }
    
   public boolean isPermutation(String s1, String s2){
  
    if (s1.length() != s2.length())  return false;
  
    int[] arr = new int[128];
  
    for(int i = 0; i < s1.length() ; i++){
      
        int value = s1.charAt(i);
      
        arr[value]++;
    }
  
    for(int i = 0; i < s2.length() ; i++){
      
        int value = s2.charAt(i);
      
        arr[value]--;
        
      if(arr[value] < 0) return false;
    }
  
    return true;
  
}
    
}
