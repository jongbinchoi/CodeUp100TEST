import java.util.Scanner;

public class 문제1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a>b ? a : b);
    }
}
