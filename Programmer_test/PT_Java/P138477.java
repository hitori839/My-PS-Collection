import java.util.Arrays;

public class P138477 {

    public static void main(String[] args) {
        P138477 T = new P138477();
        System.out.println(Arrays.toString(T.solution(3, new int[] {10, 100, 20, 150, 1, 100, 200})));
        System.out.println(Arrays.toString(T.solution(4, new int[] {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})));
    }

    public int[] solution(int k, int[] score) {
        // 정답을 담을 배열 (score와 같은 크기)
        int[] answer = new int[score.length];
        // 명예의 전당 배열 (새 점수가 들어올 공간을 위해 k+1 크기로 선언)
        int[] Hof = new int[k + 1];
        
        // score 배열의 길이만큼 반복
        for (int i = 0; i < score.length; i++) {
            // 명예의 전당 맨 마지막 칸(인덱스 k)에 새 점수를 배치
            Hof[k] = score[i];
            // 배열을 내림차순 정렬
            Hof = sort(Hof);
            
            // i가 k보다 작을 때 (명예의 전당이 아직 다 안 찼을 때)
            if (i < k) {
                // 현재 인덱스(i)의 값을 정답에 저장
                answer[i] = Hof[i];
            }
            // 명예의 전당이 꽉 찼을 때
            else {
                // k번째 순위인 인덱스 k-1의 값을 정답에 저장
                answer[i] = Hof[k - 1];
            }
        }
        return answer;
    }

    // 내림차순 정렬 함수
    public int[] sort(int[] arr) {
        // 먼저 오름차순 정렬
        Arrays.sort(arr);

        // 배열의 앞뒤를 뒤집어서 내림차순으로 변경
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return arr;
    }
}