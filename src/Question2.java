import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        int inputindex;
        inputindex=scan.nextInt();
        System.out.println(input.substring(0,inputindex));
    }
}
