// 블랙잭
import java.util.Scanner;

public class BJ_2798 {
    public static void main(String[] args) {

    // a: 카드의 개수, b: 목표 숫자
    int a, b;
    int max_sum = 0;

    // 입력 받기
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    int[] arr = new int[a];
    for (int i = 0; i < a; i++) {
        arr[i] = sc.nextInt();  
    }

    // 세 장의 카드 조합을 모두 탐색하여 최대 합 구하기
    for (int i = 0; i < a - 2; i++) {
        for (int j = i + 1; j < a - 1; j++) {
            for (int k = j + 1; k < a; k++) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum <= b && sum > max_sum) {
                    max_sum = sum;
                }
            }
        }
    }
    System.out.println(max_sum);
    }
}