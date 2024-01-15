import java.util.Scanner;

public class 문제1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 입력 : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x<=y && y!=0){
            System.out.println(x/y);
        }
    }
}
