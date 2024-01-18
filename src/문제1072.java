import java.util.Scanner;

public class 문제1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len =sc.nextInt();
        int[] nums = new int[len];

        for (int i : nums) {
            nums[i] = sc.nextInt();
            System.out.println(nums[i]);
        }
    }
}
