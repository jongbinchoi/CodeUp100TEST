import java.util.Scanner;

public class 문제1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int sum=0;
        int count=1;

        while(true){

            if(sum>=x){
                System.out.println(sum);
                break;
            }else{
                sum+=count;
                count++;
            }
        }
    }
}
