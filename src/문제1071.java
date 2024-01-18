import java.util.Scanner;

public class 문제1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 (0 입력 시 종료): ");

        printIntegersUntilZero(sc);

    }
    public static void printIntegersUntilZero(Scanner sc) { //재귀적 함수호출
        int num = sc.nextInt();

        if (num != 0) {
            System.out.println(num);
            printIntegersUntilZero(sc);
        }
    }
}
