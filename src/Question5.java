import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String string = s.next();
        String substring = s.nextLine();
        String s1 = s.next().trim();
        String newsubstring = s.nextLine();
        System.out.println(string.replace(substring,newsubstring));
    }
}
