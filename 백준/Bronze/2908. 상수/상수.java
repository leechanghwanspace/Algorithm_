import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        char[] numA = A.toCharArray();

        char temp1 = numA[0];
        numA[0] = numA[2];
        numA[2] = temp1;

        char[] numB = B.toCharArray();

        char temp2 = numB[0];
        numB[0] = numB[2];
        numB[2] = temp2;

        int reversedA = Integer.parseInt(new String(numA));
        int reversedB = Integer.parseInt(new String(numB));

        if (reversedA > reversedB) {
            System.out.println(reversedA);
        } else {
            System.out.println(reversedB);
        }
    }
}