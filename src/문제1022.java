import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 문제1022 {
    public static void main(String[] args) throws IOException {
        /*Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("문장을 입력하세요 : ");
        String str = br.readLine();
        if(str.length()<=2000){
            System.out.println(str);
        }else{
            System.out.println("문장길이가 2000가 넘습니다.");
        }
    }
}
