import java.util.Scanner;

public class 문제1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();

        boolean x = (a==0 && b==0 );
        System.out.println(x ? 1 : 0);
    }
}
