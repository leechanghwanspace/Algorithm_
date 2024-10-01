import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 정수 갯수
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();  //배열에 들어갈 정수 입력
        }

        int v = sc.nextInt();   // 찾고 싶은 정수
        int count = 0;

        for(int i = 0; i < N; i++){
            if (numbers[i] == v) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
