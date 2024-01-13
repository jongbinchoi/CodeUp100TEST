import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class 문제1013 {
    public static void main(String[] args) throws IOException {
        int a,b;

       /* Scanner sc = new Scanner(System.in);
        System.out.print("첫번쩨 정수 입력 해주세요 : ");
        a = sc.nextInt();
        System.out.print("두번쩨 정수 입력 해주세요 : ");
        b = sc.nextInt();*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("첫번째 정수 입력 해주세요 : ");
        a = Integer.parseInt(br.readLine());

        System.out.print("두번째 정수 입력 해주세요 : ");
        b = Integer.parseInt(br.readLine());
        System.out.println(a+" "+b);
    }
}
