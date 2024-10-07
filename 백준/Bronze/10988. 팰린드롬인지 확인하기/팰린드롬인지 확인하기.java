import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        char[] alphabet = S.toCharArray();

        boolean P = true;

        for(int i = 0; i < S.length(); i++){
            if(alphabet[i] != alphabet[S.length() - 1 - i]){
                P = false;
                break;
            }
        }

        if(P){
            System.out.println(1);
        } else{
            System.out.println(0);
        }

    }
}