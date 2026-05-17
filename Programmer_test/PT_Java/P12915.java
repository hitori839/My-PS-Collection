import java.util.Arrays;

public class P12915 {
    public static void main(String[] args) {
        P12915 T = new P12915();
        String[] t1 = {"sun", "bed", "car"};
        System.out.println(Arrays.toString(T.solution(t1, 1)));
        String[] t2 = {"abce", "abcd", "cdx"};
        System.out.println(Arrays.toString(T.solution(t2, 2)));
    }

    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            if (a.charAt(n) == b.charAt(n)) {
            return a.compareTo(b); 
        }
            return a.charAt(n) - b.charAt(n);
        }); 
        return strings;
    }
}
