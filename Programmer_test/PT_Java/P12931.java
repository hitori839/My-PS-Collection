public class P12931 {
    public static void main(String[] args) {
        P12931 T = new P12931();
        System.out.println(T.solution(123));
        System.out.println(T.solution(987));
    }

    public int solution(int n) {
        int answer = 0;

        String temp = String.valueOf(n);
        for (int i = 0; i < temp.length(); i++) {
            answer += temp.charAt(i) - '0';
        }

        return answer;
    }
}
