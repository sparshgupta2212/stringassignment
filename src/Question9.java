import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        int sum=0;
        int sum1=0;
        String string = s.nextLine();
        for(int i = 0;i<string.length();i++){
            char c =string.charAt(i);
            int n = (int)c;
            if(n<98){
                sum=sum+n;
            }
            else if (n>97){
                sum1=sum1+n;
            }

        }
        System.out.println(sum-sum1);
    }
}
