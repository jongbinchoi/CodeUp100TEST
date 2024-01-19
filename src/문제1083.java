import java.util.Scanner;

public class 문제1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y= 1;

        for (int i = 0; i < x; i++) {
            if(String.valueOf(y).contains("3") || String.valueOf(y).contains("6") ||String.valueOf(y).contains("9")){
                System.out.print("X ");
            }else{
                System.out.print(y+" ");
            }
            y++;
        }
    }
}
