import java.util.Arrays;

public class P12982 {
    public static void main(String[] args) {
        P12982 T = new P12982();
        System.out.println(T.solution(new int[] {1, 2, 3, 4, 5}, 9));
        System.out.println(T.solution(new int[] {2, 2, 3, 3}, 10));
    }

    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0)
                break;
            else {
                answer += 1;
            }
        }
        return answer;
    }
}
