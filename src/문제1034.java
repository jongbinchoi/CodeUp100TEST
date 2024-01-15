import java.util.Scanner;

public class 문제1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        String str = sc.nextLine();
        int x = Integer.valueOf(str,8);

        System.out.printf("%d", x);
    }
}
