import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] words = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        for(String word : words) {
            input = input.replace(word, "A");
        }
        System.out.println(input.length());
    }
}