import java.util.Scanner;

public class 문제1095 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt(); //갯수

        int[] count = new int[n];

        int minNumber = 24; // 1 ~ 23 사이의 숫자만 입력되므로 24로 초기화

        for (int i = 0; i < n; i++) {
            count[i]=sc.nextInt();

            if(count[i]<=minNumber){
                minNumber = count[i];
            }
        }

        System.out.println(minNumber);
    }
}
