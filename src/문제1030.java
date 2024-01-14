import java.util.Scanner;

public class 문제1030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력해 주세요 : ");
        long x = sc.nextLong();
        System.out.println(x);
        System.out.printf("%d", x); //%ld c에서는 이거지만 자바에서는 %d
    }
}
