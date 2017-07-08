/**
 * Created by venkat on 7/4/17.
 */
public class OneAway {

    public static void main(String[] args) {
        OneAway oneAway = new OneAway();
        if ( oneAway.oneEditAway("venkft", "venkat")){
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }

    public boolean oneEditAway(String s1, String s2) {
        if (s1.length() == s2.length()) {
            return oneEditReplace(s1, s2);
        } else if (s1.length() + 1 == s2.length()) {
            return oneEditInsert(s1,s2);
        } else if (s1.length() - 1 == s2.length()) {
            return oneEditInsert(s2, s1);
        }
        return false;
    }

    private boolean oneEditInsert(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;

        while (s1.charAt(index1) < s1.length() && s2.charAt(index2) < s2.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    public boolean oneEditReplace(String s1, String s2) {
        boolean foundDifference = false;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s1.charAt(2)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }
}
