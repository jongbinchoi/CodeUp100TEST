import java.util.Scanner;

public class 문제1093 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int num =sc.nextInt();

        int[] counts = new int[23];

        for (int i = 0; i <num; i++) {
             int x =sc.nextInt();

             if(x>=1 && x<=23){
                 counts[x-1]++; //index는 0부터 시작하기때문에 -1해줘야함.
             }
        }

        //결과출력
        for (int count: counts) {
            System.out.print(count + " ");
        }

    }
}
