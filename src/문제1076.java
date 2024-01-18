import java.util.Scanner;

public class 문제1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char x;
        char a='a';
        x =sc.nextLine().charAt(0);

        while(a<=x){
            System.out.print(a+" ");
            a++;
        }
    }
}
