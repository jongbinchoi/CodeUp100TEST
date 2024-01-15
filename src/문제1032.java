import java.util.Scanner;

public class 문제1032 {//16진수(소문자)로 출력한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("10진 정수 입력 : ");
        int x = sc.nextInt();

        String hex = Integer.toHexString(x);

        System.out.println(hex.toLowerCase());

    }
}
