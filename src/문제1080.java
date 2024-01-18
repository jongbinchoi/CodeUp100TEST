import java.util.Scanner;

public class 문제1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        int a=0;
        int sum=0;

        x = sc.nextInt();
        while(true){
            sum+=a;
            if(sum>=x){
                System.out.println(a);
                break;
            }
            a++;

        }
    }
}
