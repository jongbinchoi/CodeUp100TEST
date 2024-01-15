import java.util.Scanner;

public class 문제1038 {
    public static void main(String[] args) {
        long x,y;

        Scanner sc= new Scanner(System.in);
        System.out.print("1번째 정수 : ");
        x = sc.nextInt();
        System.out.print("2번째 정수 : ");
        y = sc.nextInt();

        System.out.println(x+y);
    }
}
//(단, 입력되는 정수는 -1073741824 ~ 1,073,741,824 이다.) 두 합이 int 범위 넘길수 있으므로 long 사용