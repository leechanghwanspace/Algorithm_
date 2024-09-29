import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 1; i <= T; i++){
            String[] input = br.readLine().split(" ");

            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            sum = A + B;

            bw.write("Case #" + i + ": " + A + " + " + B + " = " + sum + "\n");
        }


        bw.flush();
        bw.close();
        br.close();

    }
}