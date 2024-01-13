import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 문제1014 {
    public static void main(String[] args) throws IOException {

        char x,y;

        /*Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 문자를 입력해주세요 : ");
        x=sc.nextLine().charAt(0);
        System.out.print("두번째 문자를 입력해주세요 : ");
        y=sc.nextLine().charAt(0);*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("첫번째 문자를 입력해주세요 : ");
        x=br.readLine().charAt(0);
        System.out.print("두번째 문자를 입력해주세요 : ");
        y=br.readLine().charAt(0);

        System.out.println(y+" "+x);
    }
}
