import javax.net.ssl.SSLContext;
import java.util.Scanner;

public class 문제1028 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("정수를 입력하세요 ( 0 ~ 4,294,967,295):");
        long x = sc.nextLong();
        System.out.println(x);
    }
}
