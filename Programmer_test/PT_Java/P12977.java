public class P12977 {
    public static void main(String[] args) {
        P12977 T = new P12977();
        System.out.println(T.solution(new int[] {1, 2, 3, 4}));       // 1
        System.out.println(T.solution(new int[] {1, 2, 7, 6, 4}));    // 4
    }

    public int solution(int[] nums) {
        int answer = 0;
        
        // 1. 3개 숫자의 최대 합(약 3,000)을 고려해 크기 3005의 소수 체크 배열 선언
        // (0: 소수 후보, 1: 소수 아님)
        int[] check = new int[3005];
        check[0] = 1; // 0은 소수가 아님
        check[1] = 1; // 1은 소수가 아님
        
        // 2. 에라토스테네스의 체를 이용하여 3000까지의 소수 판별 배열 생성
        for (int i = 2; i <= 3000; i++) {
            if (check[i] == 0) {
                int temp = i * i;
                while (temp <= 3000) {
                    check[temp] = 1; // 소수의 배수들은 1로 마킹하여 제외
                    temp += i;
                }
            }
        }
        
        // 3. 3중 루프를 통해 서로 다른 3개의 숫자 조합 탐색
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    // 세 수의 합이 소수인지 check 배열로 바로 판별 (0이면 소수)
                    if (check[nums[i] + nums[j] + nums[k]] == 0) {
                        answer += 1;
                    }
                }
            }
        }
        return answer;
    }
}