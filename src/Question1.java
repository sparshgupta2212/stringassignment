import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        String inputString;
        Scanner scan = new Scanner(System.in);
        inputString = scan.nextLine();
        System.out.print("index: ");
        for (int i = 0;i<inputString.length();i++) {
            System.out.print("\t" + i);
        }
        System.out.print("\n");
        System.out.print("char: ");
        for(int i =0;i<inputString.length();i++){
            System.out.print("\t"+inputString.substring(0+i,i+1));
        }
    }
}
