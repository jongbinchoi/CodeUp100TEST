import java.util.Scanner;

public class 문제1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("영문자 하나 입력 : ");
        char x = sc.nextLine().charAt(0);

        int y = (int)x;
        System.out.println(y);
    }
}
