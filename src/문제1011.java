import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class 문제1011 {
    public static void main(String[] args) throws IOException {
        char x;

      /*  Scanner sc = new Scanner(System.in);
        System.out.print("문자 하나를 입력해주세요 : ");
        x =sc.next().charAt(0);
        System.out.println(x);*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("문자 하나를 입력해주세요 : ");
        x = br.readLine().charAt(0);
        System.out.println(x);
    }
}
//Scanner는 입력에서 토큰(공백으로 구분된 문자열, 정수, 부동 소수점 숫자 등)을 읽는 데 사용
//텍스트 파일을 읽거나 네트워크에서 데이터를 가져오려면 BufferedReader, 예외처리 필요