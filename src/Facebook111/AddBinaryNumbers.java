/**
 * Created by venkat on 10/8/17.
 * Given two binary strings, return their sum (also a binary string).

    For example,
    a = "11"
    b = "1"
    Return "100".
 */
public class AddBinaryNumbers {


    public String addBinary(String a, String b) {

        int i = a.length();
        int j = b.length();
        int carry = 0;
        int sum = 0;
        StringBuilder sb = new StringBuilder();

        while( i > 0 || j > 0) {

            sum = carry;
            if(i > 0) sum += a.charAt(--i) - '0';
            if(j > 0) sum += b.charAt(--j) - '0';

            sb.append(sum % 2);
            carry = sum /2;
        }

        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();

    }

    public static void main(String[] args) {

        AddBinaryNumbers addBinaryNumbers = new AddBinaryNumbers();
        System.out.print(addBinaryNumbers.addBinary("1001", "100"));
    }
}
