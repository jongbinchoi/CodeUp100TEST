import java.util.Scanner;

public class 문제1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가로 해상도(w), 세로 해상도(h), 비트(b) : ");

        int w=sc.nextInt();
        int h=sc.nextInt();
        int b=sc.nextInt();

        if(b<=40 && b%4==0 && w>=1 && w<=1024 && h>=1 && h<=1024){
            double x = (double) ((w*h*b)/8)/(1024*1024);
            System.out.printf("%.2f MB" , x);

        }
    }
}
