import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 문제1079 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine();

        int endIndex = str.indexOf('q'); //q의 위치정보를 알아내는것
        System.out.println("q의 위치는 : "+endIndex);
        if (endIndex != -1) { //q문자가 찾아진 경우, -1은 존재하지 않음을 뜻함.
            System.out.println(str.substring(0, endIndex + 1));
        } else {
            System.out.println(str);
        }
    }
}
