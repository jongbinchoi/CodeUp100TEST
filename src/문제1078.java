import java.util.Scanner;

public class 문제1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int a=1;
        int sum=0;
        if(x>=1 && x<=100){
            while (a<=x){
                if(a%2==0){
                    sum+=a;
                }
                a++;
            }
            System.out.println(sum);
        }

    }
}
