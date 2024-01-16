import java.util.Scanner;

public class 문제1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;

        a=sc.nextInt();
        b=sc.nextInt();

        System.out.printf("%d", a&b); // 비트단위 AND = &표현
    }
}
/*~(bitwise not), &(bitwise and), |(bitwise or), ^(bitwise xor),
<<(bitwise left shift), >>(bitwise right shift)*/

g