import java.util.Scanner;

public class 문제1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();
        while(true){
            if(x==1){
                break;
            }
            System.out.println(x);
            x=--x;

        }
    }
}
