import java.util.Scanner;

public class 문제1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if (a > 0 && b > 0 && c > 0) {

        if(a%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        if(b%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        if(c%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        }
    }
}
