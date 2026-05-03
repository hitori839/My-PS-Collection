import java.util.*;

public class P12906 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        P12906 T = new P12906();
        System.out.println(Arrays.toString(T.solution(arr)));
    }

    public int[] solution(int []arr) {
        int[] answer = {};
        // Stack을 사용하여 연속된 숫자를 제거
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            // Stack이 비어있거나 현재 숫자가 Stack의 top과 다르면 Stack에 추가
            // stack.peek()는 Stack의 top 요소를 제거하지 않고 반환하지만, Stack이 비어있을 때 peek()를 호출하면 EmptyStackException이 발생하므로 먼저 isEmpty()로 확인
            if (stack.isEmpty() || stack.peek() != num) {
                stack.push(num);
            }
        }
        // Stack에 남아있는 숫자들을 배열로 변환
        answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }
        return answer;
    }
}