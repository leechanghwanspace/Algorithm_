import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] numbers = input.split(" ");

        int sum = 0;

        for(String num : numbers){
            int number = Integer.parseInt(num);
            sum += number * number ;
        }

        int result = sum % 10;
        System.out.println(result);

    }
}
