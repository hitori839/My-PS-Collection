import java.util.Arrays;

public class P135808 {

    public static void main(String[] args) {
        P135808 T = new P135808();
        System.out.println(T.solution(3, 4, new int[] {1, 2, 3, 1, 2, 3, 1}));
        System.out.println(T.solution(4, 3, new int[] {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }

    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for (int i = 0; i < score.length/2; i++) {
            int temp = score[i];
            score[i] = score[score.length - (i+1)];
            score[score.length - (i+1)] = temp;
        }
        int nbox = 0;
        while (nbox + m <= score.length) {
            answer += score[nbox + m - 1] * m;
            nbox += m;
        }
        return answer;
    }
}