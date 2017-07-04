/**
 * Created by venkat on 7/3/17.
 */
public class PermutationPalindrome2 {

    public static void main(String[] args) {

        PermutationPalindrome2 p = new PermutationPalindrome2();
        if( p.isPermutationsOfPalindrome("venkathaknev")) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }

    public boolean isPermutationsOfPalindrome(String phrase) {
        int table[] = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        int oddCount = 0;

        for (char c : phrase.toCharArray()) {
            int x = PermutationPalindrome.getCharNumber(c);

            table[x]++;
            if (table[x] % 2 == 1){
                oddCount++;
            } else {
                oddCount--;
            }
        }
        return oddCount <= 1;
    }
}
