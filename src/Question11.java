import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String string = s.nextLine();
        char ch =s.next().charAt(0);
        for (int i = 0;i<string.length();i++){
            char ch1=string.charAt(i);
            if (ch1==ch){
                System.out.println(i);

            }
        }
    }

}
