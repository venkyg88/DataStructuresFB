public class RotateString {
    public static void main(String args[]) {
       String s = "f";
       RotateString ko = new RotateString();
       String  value = ko.rotateString("apoorva", 2);
       
       System.out.println("Value: "+value);
    }
    
   public String rotateString(String s, int k) {   //apoorva  k=2
     if(k == 0) return s;
  
      k = k % s.length();
  
        String r = "";
  
     for (int i = s.length() - k; i < s.length(); i++){
       r = r + s.charAt(i);                      //r = "va"
     }
  
    for(int i = 0; i < s.length() - k; i++ ) {
      r = r + s.charAt(i);
    }
  
        return r;
    }
    
}
