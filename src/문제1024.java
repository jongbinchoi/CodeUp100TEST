import java.util.Scanner;

public class 문제1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("단어를 입력해주세요 : ");
        String word = sc.nextLine();

        if(word.length()>20) {
            System.out.println("문장 길이 너무 깁니다.");
        }else{
            for (int i = 0; i < word.length(); i++) {
                System.out.println("\'"+ word.charAt(i)+"\'");
            }
        }
    }
}
