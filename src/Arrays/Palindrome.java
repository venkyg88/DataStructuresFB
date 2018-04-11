//Program to check if one string is a palindrome of another

//idea is first check for length of the strings 
//use an integer array and increment the value of coressponding positions of one sring and decrement using another

public class Palindrome {
    public boolean isPalindrome(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        
        int[] letters = new int[128];
        
        for (int i = 0 ; i < s.length(); i++ ) {
          letters[s.charAt(i)]++;
        }
        
        for( int j = 0; j < t.length(); j++ ) {
          letters[t.charAt(j)]--;
          if(letters[t.charAt(j) < 0) {
            return false;
          }
        }
        return true;
    }
}
