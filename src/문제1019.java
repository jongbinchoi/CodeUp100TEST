import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 문제1019 {
    public static void main(String[] args) throws IOException {

        String date;

       /* Scanner sc = new Scanner(System.in);
        System.out.print("날짜를 입력해주세요 예)2024.1.13 : ");
        date = sc.nextLine();
        String[] parts = date.split("\\."); // "."특수문자라 \\입력 하고 해야함.
        int year =Integer.parseInt(parts[0]); //문자열을 숫자로 변경
        int month =Integer.parseInt(parts[1]);
        int day =Integer.parseInt(parts[2]);*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("날짜를 입력해주세요 예)2024.1.13 : ");
        date =br.readLine();
        String[] parts = date.split("\\."); // "."특수문자라 \\입력 하고 해야함.
        int year =Integer.parseInt(parts[0]); //문자열을 숫자로 변경
        int month =Integer.parseInt(parts[1]);
        int day =Integer.parseInt(parts[2]);


        System.out.printf("%04d.%02d.%02d",year,month,day);
    }
}
