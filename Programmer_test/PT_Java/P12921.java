public class P12921 {
    public static void main(String[] args) {
        P12921 T = new P12921();
        System.out.println(T.solution(10));
        System.out.println(T.solution(5));
        System.out.println(T.solution(1000000));
    }

    //에라토스테네스의 체 사용
    public int solution(int n) {
        // 자동으로 기본값 false
        boolean[] check = new boolean[n+1];
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (check[i] == false) {
                answer += 1;
                int temp = i;
                while (temp <= n) {
                    if (check[temp] == false) {
                        check[temp] = true;
                        temp += i;
                    }
                    else
                        temp += i;
                }
            }
            else
                continue;
        }
        return answer;
    }
}
