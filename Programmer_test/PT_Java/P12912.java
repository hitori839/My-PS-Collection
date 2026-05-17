public class P12912 {
    public static void main(String[] args) {
        P12912 T = new P12912();
        System.out.println(T.solution(3, 5));
    }

    public long solution(int a, int b) {
        long answer = 0;
        int first = Math.min(a, b);
        int second = Math.max(a, b);
        for (int i = first; i < second + 1; i++) {
            answer += i;
        }
        return answer;
    }
}
