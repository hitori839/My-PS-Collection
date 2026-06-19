import java.util.Arrays;

public class P135808 {

    public static void main(String[] args) {
        P135808 T = new P135808();
        System.out.println(T.solution(3, 4, new int[] {1, 2, 3, 1, 2, 3, 1}));
        System.out.println(T.solution(4, 3, new int[] {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }

    public int solution(int k, int m, int[] score) {
        // 총이익을 담을 변수
        int answer = 0;
        
        // 1. 사과 점수를 오름차순 정렬
        Arrays.sort(score);
        
        // 2. 배열을 뒤집어서 내림차순으로 변경 (큰 점수가 앞으로 오도록)
        for (int i = 0; i < score.length / 2; i++) {
            int temp = score[i];
            score[i] = score[score.length - (i + 1)];
            score[score.length - (i + 1)] = temp;
        }
        
        // 상자 포장을 시작할 인덱스 포인터 변수
        int nbox = 0;
        
        // 남은 사과의 개수가 한 상자를 채울 수 있을 때(m개 이상)까지만 반복
        while (nbox + m <= score.length) {
            // 현재 상자에서 가장 낮은 점수(내림차순 배열의 nbox + m - 1 번째) * m 을 정답에 누적
            answer += score[nbox + m - 1] * m;
            
            // 다음 상자로 넘어가기 위해 m만큼 인덱스 이동
            nbox += m;
        }
        
        return answer;
    }
}