import java.util.Scanner;

public class 문제1082 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        char x = sc.nextLine().charAt(0);

        for (int i = 1; i <=15; i++) { //구구단 (1~F라면 F=15이기때문)
            int num = Integer.parseInt(String.valueOf(x), 16);//x인 문자를 문자열로 변경 후, 16진수 ->10진수로 변경

            int y = num*i; //곱셈

            String result = Integer.toHexString(y).toUpperCase(); //10진수 -> 16진수, 대문자로 변경
            System.out.println(x+"*"+Integer.toHexString(i)+"="+result);
        }

    }
}
