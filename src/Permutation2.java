import java.util.Arrays;

/**
 * Created by venkat on 7/2/17.
 */
public class Permutation2 {

    public static void main(String[] args) {

        String str1 = "venkat";
        String str2 = "Kevnat";

        if (permuationOfStrings(str1, str2)) {
            System.out.print("True");
        } else {
            System.out.print("False " +str1 +"  "+str2);
        }
    }

    private static boolean permuationOfStrings(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        String str1 = s.toLowerCase();
        String str2 = t.toLowerCase();
        int[] letters = new int[126]; //Assume ASCII
        for(int i = 0 ; i< str1.length(); i++) {
            letters[str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length();i++) {
            letters[str2.charAt(i)]--;
            if (letters[str2.charAt(i)] < 0) {
                return false;
            }
        }

//        for (int i = 0 ;i < letters.length;i++){  //for debugging only
//            System.out.println(letters[i] +":"+i);
//        }
        return true;
    }


}

