import java.util.Scanner;

public class 문제1012 {
    public static void main(String[] args) {
        float x;

        Scanner sc = new Scanner(System.in);
        System.out.print("실수 값을 입력해주세요 : ");
        x = sc.nextFloat();
        System.out.printf("%.6f",x); //소수점 아래 6자리까지
    }
}
