public class P43165 {
    int answer = 0;

    public static void main(String[] args) {
        P43165 p = new P43165();
        System.out.println(p.solution(new int[]{1, 1, 1, 1, 1}, 3));
    }
    
    public int solution(int[] numbers, int target) {
        dfs(0, 0, numbers, target);
        return answer;
    }
    
    private void dfs(int idx, int sum, int[] numbers, int target) {
        if (idx == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        
        dfs (idx + 1, sum + numbers[idx], numbers, target);
        dfs (idx + 1, sum - numbers[idx], numbers, target);
    }
}
