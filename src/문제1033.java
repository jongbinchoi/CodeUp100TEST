import java.util.Locale;
import java.util.Scanner;

public class 문제1033 { //16진수(대문자)로 출력한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("10진수를 입력 : ");
        int x = sc.nextInt();
        String str = Integer.toHexString(x);
        System.out.println(str.toUpperCase());
    }
}
