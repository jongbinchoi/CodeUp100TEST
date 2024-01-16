import java.nio.Buffer;
import java.util.Scanner;

public class 문제1053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        a= sc.nextInt();

        if(a==0 || a==1){
            boolean b = (a!=0);
            boolean flipped = !b;
            System.out.println(flipped ? 1: 0);
        }else{
            System.out.println("잘못 입력됨.");
        }
    }
}
