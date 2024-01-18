import java.util.Scanner;

public class 문제1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();
        while(true){
            if(x==0){
                break;
            }
            x=--x;
            System.out.println(x);

        }
    }
}
