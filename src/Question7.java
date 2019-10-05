import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        int sum = 0;
        for (int i =0;i<input.length();i++){
            char var = input.charAt(i);
            int a = (int)var;
            sum = sum+a;
        }
        System.out.println(sum);
    }

}
