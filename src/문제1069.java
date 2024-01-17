import java.util.Scanner;

public class 문제1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.nextLine().charAt(0);

        switch (c) {
            case 'A':
                System.out.println("best");
                break;
            case 'B':
                System.out.println("normal");
                break;
            case 'C':
                System.out.println("bad");
                break;
            default:
                System.out.println("잘못입력하셨습니다");
                break;
        }
    }
}
