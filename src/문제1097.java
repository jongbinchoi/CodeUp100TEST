import java.util.Scanner;

public class 문제1097 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        int a,b;
        int arr[][]=new int[19][19];
        for(int j=0;j<19;j++){
            for(int k=0;k<19;k++){
                x=sc.nextInt();
                arr[j][k]=x;
            }
        }
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            for(int j=0;j<19;j++) {
                if(arr[a-1][j]==0) {
                    arr[a-1][j]=1;
                }else {
                    arr[a-1][j]=0;
                }
            }
            for(int k=0;k<19;k++) {
                if(arr[k][b-1]==0) {
                    arr[k][b-1]=1;
                }else {
                    arr[k][b-1]=0;
                }
            }
        }
        for(int i=0;i<19;i++){
            for(int j=0;j<19;j++){
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
