import java.util.Scanner;

public class 문제1096 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[][] board =new int[19][19]; //19*19 바둑판 초기화
        int n = sc.nextInt(); //흰돌 개수

        System.out.println("흰 돌을 놓을 좌표를 입력 x,y");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt()-1; //배열 인덱스는 0부터시작 하므로 1을 빼줌
            int y = sc.nextInt()-1;
            board[x][y]=1;
        }

        //바둑판 출력
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }



    }
}
