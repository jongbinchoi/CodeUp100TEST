import java.util.Scanner;

public class 문제1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();

        if(x>0){
            System.out.println("plus");
            if(x%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }else{
            System.out.println("minus");
            if(x%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
    }
}
