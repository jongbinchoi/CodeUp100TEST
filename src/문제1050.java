import java.util.Scanner;

public class 문제1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        a= sc.nextInt();
        b= sc.nextInt();

        if(a==b){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
