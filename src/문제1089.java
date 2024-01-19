import java.util.Scanner;

public class 문제1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(); //시작 값
        int d=sc.nextInt(); // 등차의 값
        int n= sc.nextInt(); // 정수

        System.out.println(a+(n-1)*d); //등차수열 적용
    }
}
