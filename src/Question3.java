import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        for(int i = 0;i<input.length();i++){
            if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'||input.charAt(i)=='A'||input.charAt(i)=='E'||input.charAt(i)=='I'||input.charAt(i)=='O'||input.charAt(i)=='U'){
                input = input.replace(input.charAt(i),  '*');
            }
        }
        System.out.println(input);
    }
}
