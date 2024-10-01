import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] numbers = new int[N];

        for (int index = 0; index < N; index++) {
            numbers[index] = index + 1;
        }

        for (int x = 0; x < M; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int temp = numbers[i - 1];
            numbers[i - 1] = numbers[j - 1];
            numbers[j - 1] = temp;
        }

        for (int y = 0; y < N; y++) {
            System.out.print(numbers[y] + " ");
        }
    }
}
