import sun.util.resources.cldr.ga.CurrencyNames_ga;

/**
 * Created by venkat on 7/3/17.
 */
public class PermutationPalindrome {

    public static void main(String[] args) {
        //step1: generate a hashtable with letters and numbers
        //step2: Identify only the required letters
        //step3: only one letter could be odd all the remaining should be even to be a palindrome


        String str1 = "venkknve";
        if(isPermutationOfPalindrome(str1)){
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }

    public static boolean isPermutationOfPalindrome(String phrase) {
        int[] table = getHashTable(phrase);
        return oneMaxEvenNumber(table);

    }

    public static boolean oneMaxEvenNumber(int[] table) {
        boolean flag = false;
        for (int count : table) {
            if (count % 2 == 1) {
                if (flag){
                    return false;
                }
                flag = true;
            }
        }
        return true;
    }

    public static int[] getHashTable(String phrase) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1]; //size = 26

        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);

            if(x != -1) {
                table[x]++;
            }
        }
        return table;

    }

    public static int getCharNumber(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);

        if (val >= a && val <= z) {
            return val - a;
        }
        return -1;
    }
}
