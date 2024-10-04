
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int R = sc.nextInt();
            String input = sc.next();

            StringBuilder result = new StringBuilder();

            for(int j = 0; j < input.length(); j++){
                char ch = input.charAt(j);

                for(int k = 0; k < R; k++){
                    result.append(ch);
                }
            }

            System.out.println(result.toString());
        }

    }
}