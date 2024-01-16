import java.util.Scanner;

public class 문제1055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();

        boolean x = (a==1 || b==1);
        System.out.println(x ? 1 : 0);
    }
}
