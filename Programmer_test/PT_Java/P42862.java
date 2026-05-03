// 체육복
public class P42862 {
    public void main(String[] args) {
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};

        System.out.println(new Solution().solution(n, lost, reserve));
    }

    class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = 0;
            // 1. 전체 학생 수 만큼의 배열을 만들어서 1로 초기화
            int[] arr = new int[n + 1];
            for (int i = 1; i<=n; i++) {
                arr[i] = 1;
            }
            // 2. 잃어버린 학생은 -1, 여벌이 있는 학생은 +1
            for (int i : lost) {
                arr[i] -= 1;
            }
            for (int i : reserve) {
                arr[i] += 1;
            }
            // 3. 잃어버린 학생이 여벌이 있는 학생에게 빌릴 수 있는지 확인
            for (int i = 1; i <= n; i++) {
                if (arr[i] == 0) {
                    // 잃어버린 학생이 여벌이 있는 학생에게 빌릴 수 있는지 확인
                    for (int j = i-1; j <= i+1; j = j+2) {
                        if ((j > 0) && (j <= n)) {
                            if(arr[j] > 1) {
                                arr[j] -= 1;
                                arr[i] += 1;
                                break;
                            }
                        }
                    }
                }
            }
            for (int i = 1; i<=n; i++) {
                if (arr[i] != 0) {
                    answer += 1;
                }
            }
            return answer;
        }
    }
}