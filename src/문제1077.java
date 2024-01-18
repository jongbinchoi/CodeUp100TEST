import java.util.Scanner;

public class 문제1077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int a =0;

        if(x<=100 && x>=0){
            while(a<=x){
                System.out.println(a);
                a++;
            }
        }
    }
}
