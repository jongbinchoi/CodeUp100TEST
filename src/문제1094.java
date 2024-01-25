import java.util.Scanner;

public class 문제1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] count = new int[num];
        for (int i = 0; i < num; i++) {
           count[i]=sc.nextInt();
        }

        for (int i = num-1; i >= 0; i--) {//역순으로 출력제
            System.out.print(count[i]+" ");
        }

    }
}
