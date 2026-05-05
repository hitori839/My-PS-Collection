import java.util.PriorityQueue;

public class P42626 {  
    public static void main(String[] args) {
        P42626 p42626 = new P42626();
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        System.out.println(p42626.solution(scoville, K));
    }
    public int solution(int[] scoville, int K) {
        int answer = 0;
        // 우선순위 큐를 이용하여 가장 작은 두 개의 스코빌 지수를 빠르게 찾을 수 있도록 합니다.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // 모든 스코빌 지수를 우선순위 큐에 추가합니다.
        for (int s : scoville) {
            pq.offer(s);
        }
        // 가장 작은 스코빌 지수가 K 이상이 될 때까지 반복합니다.
        while (pq.peek() < K) {
            // 스코빌 지수가 가장 작은 음식이 K 이상이 되지 않는 경우, 가장 작은 두 개의 음식을 섞어서 새로운 음식을 만듭니다.
            if (pq.size() < 2) {
                return -1;
            }
            int first = pq.poll();
            int second = pq.poll();
            pq.offer(first + (second * 2));
            answer++;
        }
        return answer;
    }
}