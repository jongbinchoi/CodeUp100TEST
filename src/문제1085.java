import java.util.Scanner;

public class 문제1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("체크 횟수 (Hz) : ");
        int h = sc.nextInt();

        System.out.print("저장 비트 : ");
        int b = sc.nextInt();

        System.out.print("채설 수 (모노 =1, 스테리오 =2) : ");
        int c = sc.nextInt();

        System.out.print("녹음할 시간 (초) : ");
        int s = sc.nextInt();

        long bitsPerSecond = h*b*c*s;
        long bytesPerSecond = bitsPerSecond/8;
        double megabytesPerSecond = (double) bytesPerSecond/(1024*1024);
        System.out.printf("%.1f MB", megabytesPerSecond);
    }
}
