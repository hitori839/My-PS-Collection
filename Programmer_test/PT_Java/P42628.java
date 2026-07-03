import java.util.PriorityQueue;
import java.util.Arrays;

public class P42628 {
    public static void main(String[] args) {
        P42628 T = new P42628();
        System.out.println(Arrays.toString(T.solution(new String[] {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"})));
        System.out.println(Arrays.toString(T.solution(new String[] {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"})));
    }

    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
        String[] temp = new String[2];
        int itemp;
        // root가 최소값
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // root가 최대값
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for (int i = 0; i < operations.length; i++) {
            temp = operations[i].split(" ");
            itemp = 0;
            if (temp[0].equals("I")) {
                itemp = Integer.valueOf(temp[1]);
                maxHeap.add(itemp);
                minHeap.add(itemp);
            }
            else {
                if (!maxHeap.isEmpty()) {
                    if (temp[1].equals("1")) {
                        itemp = maxHeap.poll();
                        minHeap.remove(itemp);
                    }
                    else {
                        itemp = minHeap.poll();
                        maxHeap.remove(itemp);
                    }
                }
                else {
                    continue;
                }
            }
        }
        if (maxHeap.peek() == null) {
            return answer;
        }
        else {
            answer[0] = maxHeap.poll();
            answer[1] = minHeap.poll();
            return answer;
        }
    }
}