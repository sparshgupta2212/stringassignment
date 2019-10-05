import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int sum = 0;
        String string = s.nextLine();
        for(int i =0;i<string.length();i++){
            char a = string.charAt(i);
            int n =(int)a;
            if (n<98){
                sum = sum +n;
            }
        }
        System.out.println(sum);
    }
}
