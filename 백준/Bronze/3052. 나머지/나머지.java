import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        boolean[] remainders = new boolean[42];


        int count = 0;

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());

            int remainder = n % 42;

            if (!remainders[remainder]) {
                remainders[remainder] = true;
                count++;
            }
        }

        System.out.println(count);
    }
}
