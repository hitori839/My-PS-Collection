import java.util.Arrays;

public class P120923 {
    public static void main(String[] args) {
        P120923 T = new P120923();
        System.out.println(Arrays.toString(T.solution(3, 12)));
        System.out.println(Arrays.toString(T.solution(5, 15)));
        System.out.println(Arrays.toString(T.solution(4, 14)));
        System.out.println(Arrays.toString(T.solution(5, 5)));
    }

    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int ind1, ind2;
        if ((num % 2) == 1) {
            ind1 = total / num;
            for (int i = 0; i <= num / 2; i++) {
                answer[answer.length/2 - i] = ind1 - i;
                answer[answer.length/2 + i] = ind1 + i;
            }
        }
        else {
            ind1 = total / num;
            ind2 = total / num + 1;
            for (int i = 0; i < num / 2; i++) {
                answer[answer.length/2 - 1 - i] = ind1 - i;
                answer[answer.length/2 + i] = ind2 + i;
            }
        }
        return answer;
    }
}