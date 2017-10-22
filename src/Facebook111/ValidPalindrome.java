/*Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
*/

class ValidPalindrome {
    public boolean isPalindrome(String s) {
        //how to identify it's alpha numeric (alphabet/digit)
        //check from both ends
        s = s.toLowerCase();
        if(s == null) return true;
        
        int start = 0, end = s.length() - 1;
        
        while( start <= end) {
            if(!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            } else {
                
                if(s.charAt(start) != s.charAt(end)) {
                    return false;
                }
                start++; 
                end--;
            }
        }
        
        return true;
    }
}
