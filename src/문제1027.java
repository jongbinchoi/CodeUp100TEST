import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문제1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("yyyy.mm.dd 년월일 입력해주세요 : ");
        String date = br.readLine();
        String[] src = date.split("\\.");
        int year = Integer.parseInt(src[0]);
        int month = Integer.parseInt(src[1]);
        int day = Integer.parseInt(src[2]);

        System.out.printf("%02d-%02d-%04d",day,month,year);

    }
}
