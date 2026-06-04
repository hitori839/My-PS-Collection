import java.util.Arrays;

public class P12933 {
    public static void main(String[] args) {
        P12933 T = new P12933();
        System.out.println(T.solution(118372l));
    }

    public long solution(long n) {
        String str = Long.toString(n);
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        StringBuilder sb = new StringBuilder(new String(temp));
        String str2 = sb.reverse().toString();
        long answer = Long.parseLong(str2);
        return answer;
    }
}