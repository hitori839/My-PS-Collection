import java.util.ArrayList;
import java.util.Arrays;

public class P12932 {
    public static void main(String[] args) {
        P12932 T = new P12932();
        System.out.println(Arrays.toString(T.solution(12345l)));
    }

    public int[] solution(long n) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList());
        Long temp = n;
        while (temp > 0l) {
            list.add((int)(temp % 10));
            temp /= 10l;
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i); 
        }
        return answer;
    }
}