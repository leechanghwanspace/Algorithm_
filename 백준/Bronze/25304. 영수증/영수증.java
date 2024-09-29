import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= Y; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            sum = sum + (a * b);
        }

        if (sum == X){
             System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
