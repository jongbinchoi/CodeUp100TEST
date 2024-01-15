import java.util.Scanner;

public class 문제1031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("10진수를 입력해주세요 : ");
        int x =sc.nextInt();

        System.out.printf("10진수 : %d\n", x);
        System.out.printf("8진수 : %o", x);

    }
}

// 10진수 : %d
// 16진수 : %o
// 8진수 : %x
    /*      10진수 -> 2진수 변환 : Integer.toBinaryString(int);
            10진수 -> 8진수 변환 : Integer.toOctalString(int);
            10진수 -> 16진수 변환 : Integer.toHexString(int);
            2진수 -> 10진수 변환 : Integer.valueOf(string, 2);
            8진수 -> 10진수 변환 : Integer.valueOf(string, 8);
            16진수 -> 10진수 변환 : Integer.valueOf(string, 16);*/
