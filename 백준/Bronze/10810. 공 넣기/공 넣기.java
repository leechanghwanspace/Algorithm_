import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] numbers = new int[N];

        for(int x = 0; x < M; x++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int index = i - 1; index < j; index ++){
                numbers[index] = k;
            }
        }

        for(int y = 0; y < N; y++){
            System.out.print(numbers[y] + " ");
        }
        
        sc.close();
    }
}
