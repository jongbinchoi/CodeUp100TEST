import java.util.Scanner;

public class 문제1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        //System.out.println(a*(int)Math.pow(2,b));
        if(a>=0 && a<=10 && b>=0 && b<=10)
        System.out.printf("%d", a<<b); //a*2^b 공식
    }
}
