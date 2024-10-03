import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int i = sc.nextInt();
        
        char[] words = input.toCharArray();

        System.out.println(words[i - 1]);

        sc.close();

    }
}