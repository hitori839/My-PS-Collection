import java.util.*;

public class P42746 {
    public String solution(int[] numbers) {
        String[] s_numbers = new String[numbers.length];
        
        // 1. 정수 배열을 문자열 배열로 변환
        for (int i = 0; i < numbers.length; i++) {
            s_numbers[i] = String.valueOf(numbers[i]);
        }
        
        // 2. 비교 정렬 (a+b와 b+a를 비교)
        Arrays.sort(s_numbers, (a, b) -> (b + a).compareTo(a + b));
        
        // 3. 예외 처리: 모든 숫자가 0인 경우 (정렬 후 첫 번째가 "0"이면 나머지도 다 0임)
        if (s_numbers[0].equals("0")) {
            return "0";
        }
        
        // 4. StringBuilder를 사용하여 효율적으로 문자열 결합
        StringBuilder answer = new StringBuilder();
        for (String s : s_numbers) {
            answer.append(s);
        }
        
        return answer.toString();
    }
    public static void main(String[] args) {
        P42746 p = new P42746();
        int[] numbers = {3, 30, 34, 5, 9};
        System.out.println(p.solution(numbers));
    }
}