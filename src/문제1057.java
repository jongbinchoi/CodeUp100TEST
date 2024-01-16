import java.util.Scanner;

public class 문제1057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();

        boolean x = (a==b);
        System.out.println(x ? 1: 0);
    }
}
