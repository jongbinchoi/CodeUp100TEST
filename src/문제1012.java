import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 문제1012 {
    public static void main(String[] args) throws IOException {
        float x;

        /*Scanner sc = new Scanner(System.in);
        System.out.print("실수 값을 입력해주세요 : ");
        x = sc.nextFloat();*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("실수 값을 입력해주세요 : ");
        x = Float.parseFloat(br.readLine());
        System.out.printf("%.6f",x); //소수점 아래 6자리까지
    }
}
