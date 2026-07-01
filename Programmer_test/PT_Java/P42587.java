import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;

public class P42587 {
    public static void main(String[] args) {
        P42587 T = new P42587();
        // System.out.println(T.solution(new int[] {2,1,3,2}, 2));
        System.out.println(T.solution(new int[] {1,1,9,1,1,1}, 0));
    }

    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[] {priorities[i], i});
        }

        Arrays.sort(priorities);
    
        int m_index = priorities.length - 1;
        int order = 0;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            if (current[0] == priorities[m_index]) {
                order += 1;
                m_index -= 1;

                if (current[1] == location){
                    return order;
                }
            }
            else {
                queue.add(current);
            }
        }
        int answer = order;
        return answer;
    }

}
