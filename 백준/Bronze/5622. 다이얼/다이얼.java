import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] num = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();

        int sum = 0;

        for (int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);

            for (int j = 0; j < num.length; j++) {
                if (num[j].indexOf(ch) != -1) {
                    sum += (j + 3);
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}