import java.util.Scanner;

public class 문제1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = 1; i <=a ; i++) {
            for (int j = 1; j <=b ; j++) {
                System.out.println(i+" "+j);
            }

        }
    }
}
