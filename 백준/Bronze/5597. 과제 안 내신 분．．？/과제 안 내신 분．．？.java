import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[30];

        // A = 제출한 학생
        for (int i = 0; i < 28; i++) {
            int A = sc.nextInt();
            numbers[A - 1] = 1;
        }

        // B = 제출하지 않은 학생
        for (int i = 0; i < 30; i++) {
            if (numbers[i] == 0) {
                System.out.println(i + 1);
            }
        }

        sc.close();
    }
}