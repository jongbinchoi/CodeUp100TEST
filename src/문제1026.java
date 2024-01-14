import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 문제1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("시:분:초 입력해주세요 : ");
        String time =sc.nextLine();

        String[] times=time.split(":");
        System.out.println(times[1]);
    }
}
