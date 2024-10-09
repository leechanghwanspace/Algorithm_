import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().toUpperCase();
        int[] count = new int[26];

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(ch >= 'A' && ch <='Z'){
                count[ch - 'A']++;
            }
        }

        int maxCount = 0;
        char maxChar = '?';

        for(int i = 0; i < 26; i++){
            if (count[i] > maxCount){
                maxCount = count[i];
                maxChar = (char) (i + 'A');
            }
            else if (count[i] == maxCount){
                maxChar = '?';
            }
        }

        System.out.println(maxChar);
    }
}