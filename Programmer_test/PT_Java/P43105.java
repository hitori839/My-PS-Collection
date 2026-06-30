public class P43105 {
    public static void main(String[] args) {
        P43105 T = new P43105();
        System.out.println(T.solution(new int[][] {{7}, {3,8}, {8,1,0}, {2,7,4,4}, {4,5,2,6,5}})); // 30
    }

    public int solution(int[][] triangle) {
        int n = triangle.length;
        // 최댓값을 누적해 나갈 DP 테이블 선언
        int[][] check = new int[n][n];
        
        // 1. 가장 밑바닥 층의 값들을 DP 테이블에 그대로 초기화
        for (int i = 0; i < n; i++) {
            check[n-1][i] = triangle[n-1][i];
        }
        
        // 2. 밑에서 두 번째 층(n-2)부터 꼭대기(0)까지 역순으로 올라가며 계산
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                // 왼쪽 아래 자식과 오른쪽 아래 자식 중 더 큰 값을 골라 현재 칸의 값과 더함
                check[i][j] = check[i+1][j] + triangle[i][j];
                if (check[i][j] < check[i+1][j+1] + triangle[i][j]) {
                    check[i][j] = check[i+1][j+1] + triangle[i][j];
                }
            }
        }
        
        // 3. 꼭대기 층에 최종 모인 최댓값 반환
        return check[0][0];
    }
}