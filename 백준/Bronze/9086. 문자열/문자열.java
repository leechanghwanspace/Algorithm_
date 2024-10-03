import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < T; i++){
            String input = sc.nextLine();
            char[] words = input.toCharArray();

            System.out.println(words[0]+""+words[input.length()-1]);
        }

        sc.close();

    }
}
