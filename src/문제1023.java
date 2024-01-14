import java.util.Scanner;

public class 문제1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double d;

        while (true) {
            System.out.print("값을 입력 : ");
            d = sc.nextDouble();

            if(Math.abs(d) <= 10000 && String.valueOf(d).matches("-?\\d+(\\.\\d{1,6})?")){
                String[] part = String.valueOf(d).split("\\.");
                System.out.println(part[0]);
                System.out.println(part[1]);
                break;
            }else{
                System.out.println("잘못 입력하셨습니다 다시 입력해주세요!");
            }

        }
    }
}
// "-?\\d+(\\.\\d{1,6})?"
//-? : 음수 부호가 있을 수 도 있고 없을 수도있다는 점
//\\d+: 하나 이상의 숫자가 연속되어야 함
//(\\.\\d{1,6}): 소수점 이하 부분을 나타냅니다. \\.는 소수점을 나타내고, \\d{1,6}는 1자리에서 6자리 사이의 숫자가 있어야 함
//? : 소수점 이하 부분이 있을 수도있고 없을 수도 있음