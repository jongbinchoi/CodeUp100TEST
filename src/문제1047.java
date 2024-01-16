import java.util.Scanner;

public class 문제1047 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("정수 1개 입력 : ");
        int x = sc.nextInt();

        System.out.printf("%d", x<<1); //2배 한 값 출력, 반대로 x>>1일때 경우 반으로 나눔
    }
}
