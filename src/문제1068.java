import java.util.Scanner;

public class 문제1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x =sc.nextInt();
        
        if(90<=x && x<=100){
            System.out.println("A");
        } else if (70<=x && x<=89) {
            System.out.println("B");
        } else if (40<=x && x<=69) {
            System.out.println("C");
        } else if (0<=x && x<=39) {
            System.out.println("D");
        }else{
            System.out.println("잘못된 입력입니다.");
        }

    }
}
