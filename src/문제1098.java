import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class 문제1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //격자판
        int h = sc.nextInt(); //세로
        int w = sc.nextInt(); //가로

        int[][] grid = new int[h][w];

        int n = sc.nextInt(); //막대 개수

        for (int i = 0; i < n; i++) {
            //막대 정보입력
            int l = sc.nextInt(); //막대의 길이
            int d = sc.nextInt(); //방향 가로 : 0 세로 : 1
            int x = sc.nextInt()-1; //x좌표 , 인덱스는 0부터 시작하기 때문 -1해줌
            int y= sc.nextInt()-1; //y좌표

            //막대 놓기
            for (int j = 0; j < l; j++) {
                if(d==0 && (y+j)<w){ // 가로
                    grid[x][y+j]=1;
                }else if(d==1 && (x+j)<h){//세로
                    grid[x+j][y]=1;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }

    }
}
