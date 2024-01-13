import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 문제1018 {
    public static void main(String[] args) throws IOException {

        String time;

       /* Scanner sc = new Scanner(System.in);

        System.out.print("시간을 입력하세요 (예 : 7:20) : ");
        time = sc.nextLine(); //문자열 그대로 입력받아옴

        String[] parts = time.split(":"); // : 기호를 기준으로 문자열을 분리

        String hour = parts[0]; //첫 번째 부분은 시간
        String minute = parts[1]; //두 번째 부분은 시간
*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("시간을 입력하세요 (예 : 7:20) : ");
        time = br.readLine();

        String[] parts = time.split(":");

        String hour = parts[0];
        String minute = parts[1];

        System.out.println(hour);
        System.out.println(minute);
        System.out.println(hour+ ":"+minute);


    }
}
