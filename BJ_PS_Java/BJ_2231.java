import java.util.Scanner;

public class BJ_2231 {
    public static void main(String[] args) {
        // 분해합
        int a;
        int j;
        int sum = 0;
        int Con = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        // 1부터 a까지의 수를 하나씩 증가시키면서 각 자리수의 합을 구해서 a와 같은지 비교
        for (int i = 1; i < a; i++) {
            sum = i;
            j = i;
            while (j > 0) {
                sum += j % 10;
                j /= 10;
            }
            if (sum == a) {
                Con = i;
                break;
            }
        }
        System.out.println(Con);
    }
}