public class P176963 {
    public static void main(String[] args) {
        P176963 sol = new P176963();
        int[] result = sol.solution(
            new String[]{"may", "kein", "kain", "radi"}, 
            new int[]{5, 10, 1, 3}, 
            new String[][]{
                {"may", "kein", "kain", "radi"}, 
                {"may", "kein", "brin", "deny"}, 
                {"kon", "kain", "may", "coni"}
            }
        );
        for (int score : result) {
            System.out.println(score);
        }
    } 
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 결과 배열의 크기를 photo의 개수만큼 미리 지정합니다.
        int[] answer = new int[photo.length]; 
        
        // photo의 각 요소마다 name과 비교하여 yearning 점수를 더해준다.
        for (int i = 0; i < photo.length; i++) {
            int score = 0;
            for (int k = 0; k < photo[i].length; k++) {
                for (int j = 0; j < name.length; j++) {
                    if (photo[i][k].equals(name[j])) {
                        score += yearning[j];
                        break; 
                    }
                }
            }
            answer[i] = score;
        }
        return answer;
    }
}
