import java.util.Scanner;

public class 문제1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int result = a;

        if(a>=-50 && a<=50 && m>=-50 && m<=50 && d>=-50 && d<=50 && n>1 && n<=10){

            for (int i = 1; i <n; i++) {
                result = result * m+d;

            }
            System.out.println(result);
        }
    }
}
