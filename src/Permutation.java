import java.util.Arrays;

/**
 * Created by venkat on 7/2/17.
 */
public class Permutation {

    public static void main(String[] args) {

        String str1 = "Dog";
        String str2 = "god";

        if (permuationOfStrings(str1, str2)) {
            System.out.print("True");
        } else {
            System.out.print("False " +str1 +"  "+str2);
        }
    }

    private static boolean permuationOfStrings(String str1, String str2) {

        if(str1.length() != str2.length()) {
            return false;
        }

        return sort(str1).equals(sort(str2));
    }

    private static String sort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars).toLowerCase();
        //return chars.toString // this is a blunder remember why!

    }
}
