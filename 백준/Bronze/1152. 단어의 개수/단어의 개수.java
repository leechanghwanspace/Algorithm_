import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String words = sc.nextLine().trim();
        String[] wordArray = words.split(" ");

        int count = 0;

        for(int i = 0; i < wordArray.length; i++){
            if(!wordArray[i].equals("")){
                count ++;
            }
        }
        System.out.print(count);
    }
}