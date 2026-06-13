public class P12940 {
    public static void main(String[] args) {
        P12940 T = new P12940();
        System.out.println(T.solution(5, 2));    
    }

    public int[] solution(int n, int m) {
        int[] answer = {1, 1};
        int min = n;
        int max = m;
        if (min > m) {
            min = m;
            max = n;
        }
        for (int i = 2; i <= min; i++) {
            if ((n % i == 0) && (m % i == 0)) {
                answer[0] = i;
            }
        }
        for (int i = min; i <= max * min; i++) {
            if ((i % n == 0) && (i % m == 0)) {
                answer[1] = i;
                break;
            }
        }
        return answer;
    }
}
