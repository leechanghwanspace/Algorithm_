import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] score = new int[N];

        int max = 0;
        float sum = 0;

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
            sum += score[i];

            if (score[i] > max) {
                max = score[i];
            }
        }

        float avg = sum / N;
        System.out.println((avg / max) * 100);

        sc.close();
    }
}