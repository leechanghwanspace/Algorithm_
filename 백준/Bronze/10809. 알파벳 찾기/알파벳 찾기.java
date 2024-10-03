import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        int[] alphabet = new int[26];
        for(int i = 0; i < 26; i++){
            alphabet[i] = -1;
        }

        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            int index = ch - 'a';

            if(alphabet[index] == -1){
                alphabet[index] = i;
            }
        }

        for(int i = 0; i < 26; i++){
            System.out.print(alphabet[i] + " ");
        }

        sc.close();
    }
}