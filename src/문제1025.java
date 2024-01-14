import java.util.Scanner;

public class 문제1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("다섯 자리의 정수 1개를 입력 : ");
        int x = sc.nextInt();

        //정수를 문자열로 변환
        String numberStr = String.valueOf(Math.abs(x));
        if(numberStr.length()==5){
            x = Integer.parseInt(numberStr); //문자열을 정수로
            int tenThousands = x / 10000; // 만의 자리
            int thousands = (x/ 1000) % 10; // 천의 자리
            int hundreds = (x / 100) % 10; // 백의 자리
            int tens = (x / 10) % 10; // 십의 자리
            int ones = x % 10; // 일의 자리

            // 각 자리 수의 값을 계산하고 출력
            System.out.println("[" + tenThousands * 10000 + "]");
            System.out.println("[" + thousands * 1000 + "]");
            System.out.println("[" + hundreds * 100 + "]");
            System.out.println("[" + tens * 10 + "]");
            System.out.println("[" + ones + "]");
        }
        else{
            System.out.println("잘 못 입력하셨습니다.");
        }
    }
}
