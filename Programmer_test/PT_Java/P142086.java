import java.util.Arrays;

public class P142086 {
    public static void main(String[] args) {
        P142086 T = new P142086();
        System.out.println(Arrays.toString(T.solution("banana")));
        System.out.println(Arrays.toString(T.solution("foobar")));
    }

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] alpha = new int[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (alpha[temp - 'a'] == -1)
                answer[i] = -1;
            else
                answer[i] = i - alpha[temp - 'a'];
            alpha[temp - 'a'] = i;
        }
        return answer;
    }
}