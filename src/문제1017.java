import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 문제1017 {
    public static void main(String[] args) throws IOException {

        int x;

       /* Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나 입력 : ");
        x= sc.nextInt();
        for (int i = 0; i < 3; i++) {
            System.out.print(x+" ");
        }*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("정수 하나 입력 : ");
        x = Integer.parseInt(br.readLine());
        for (int i = 0; i < 3; i++) {
            System.out.print(x+" ");
        }
    }
}
