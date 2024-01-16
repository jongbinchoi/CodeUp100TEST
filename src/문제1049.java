import java.util.Scanner;

public class 문제1049 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int x,y;

        x=sc.nextInt();
        y=sc.nextInt();

        if(x>y){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
