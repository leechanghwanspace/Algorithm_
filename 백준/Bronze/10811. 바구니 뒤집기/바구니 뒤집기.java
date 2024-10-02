import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = i + 1;
        }

        for(int x = 0; x < M; x++){
            int i = sc.nextInt();
            int j = sc.nextInt();

            while(i < j){
                int temp = array[i - 1];
                array[i - 1] = array[j - 1];
                array[j - 1] = temp;

                i++;
                j--;
            }
        }

        for(int i = 0; i < N; i++){
            System.out.print(array[i] + " ");
        }

        sc.close();

    }
}