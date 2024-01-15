import java.util.Scanner;

public class 문제1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;

        System.out.print("정수 입력 : ");
        a = sc.nextInt();
        b = sc.nextInt();

        if(a>=0 && b>=0 && b!=0){
            System.out.println(a%b);
        }
    }
}
