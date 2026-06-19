public class P77884 {
    public static void main(String[] args) {
        P77884 T = new P77884();
        System.out.println(T.solution(13, 17));
        System.out.println(T.solution(24, 27));
    }

    public int solution(int left, int right) {
        int answer = 0;
        int[] divisor = new int[right+1];
        for (int i = 0; i <= right; i++) {
            divisor[i] = 1;
        }
        int temp = 0;
        for (int i = 2; i <= right; i++) {
            temp = i;
            while (temp <= right) {
                divisor[temp] += 1;
                temp += i;
            }
        }
        for (int i = left; i <= right; i++) {
            if ((divisor[i] % 2) == 0) {
                answer += i;
            }
            else {
                answer -= i;
            }
        }
        return answer;
    }
}