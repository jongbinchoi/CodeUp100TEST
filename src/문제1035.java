import java.util.Scanner;

public class 문제1035 {
    public static void main(String[] args) {
        //16진수 -> 8진수
        //(단, 16진수는 영문 소문자로 입력된다.)
        Scanner sc = new Scanner(System.in);

        System.out.print("16진수를 입력 : ");
        String str = sc.nextLine();

        int x = Integer.valueOf(str,16);
        String y = Integer.toOctalString(x); //int는 10진수로 간주해서 String으로 받아야함.

        System.out.println(y);
    }
}
