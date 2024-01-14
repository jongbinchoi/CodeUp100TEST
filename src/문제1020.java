import java.util.Scanner;

public class 문제1020 {
    public static void main(String[] args) {
        String str;

        // TODO: 2024-01-13 방법 1
       /* Scanner sc = new Scanner(System.in);
        System.out.print("주민번호 13자리를 입력해주세요 : ");
        str=sc.nextLine(); //주문번호 받아옴
        str= str.replace("-",""); //replace, replaceAll 차이 replace는 특수문자도 치환가능, replaceAll X
        System.out.println(str);*/

        // TODO: 2024-01-13 방법 2
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호 13자리를 입력해주세요 : ");
        str=sc.nextLine();
        String[] parts = str.split("-");
        String birth = parts[0];
        String remain = parts[1];

        System.out.println(birth+remain);

    }
}
