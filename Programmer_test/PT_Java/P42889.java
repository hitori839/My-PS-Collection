import java.util.*;

public class P42889 {

    public static void main(String[] args) {
        P42889 T = new P42889();
        System.out.println(T.solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3}));
        //System.out.println(T.solution(4, new int[] {4, 4, 4, 4, 4}));
    }

    public int[] solution(int N, int[] stages) {
        
        int[] complete = new int[N];
        
        Map<Integer, Double> fail = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            complete[i] = i+1;
        }
        
        int[] t_stages = stages.clone();
        Arrays.sort(t_stages);
        
        int M = stages.length;
        int K = 0;
        int idx = 0;
        
        for (int i = 0; i < N; i++) {
            while (true) {
                if (idx >= t_stages.length) {
                    break;
                }
                if (complete[i] < t_stages[idx]) {
                    break;
                }
                else {
                    K++;
                    idx++;
                }
            }
            if (M == 0) {
                break;
            }
            fail.put(i+1, (double) K/M);
            System.out.println((double) K/M);
            M = M - K;
            System.out.println(M);
            K = 0;
        }
        
        Integer[] t_answer = fail.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .map(Map.Entry::getKey)
        .toArray(Integer[]::new);
        
        int[] answer = Arrays.stream(t_answer)
                       .mapToInt(Integer::intValue) 
                       .toArray();
        
        return answer;
    }
}