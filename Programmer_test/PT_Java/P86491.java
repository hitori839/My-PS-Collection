public class P86491 {
    // 2020 카카오 인턴십 - 최소 직사각형
    public int solution(int[][] sizes) {
        int answer = 0;
        // 가로, 세로 선언
        int wid = 0;
        int leng = 0;
        int a = 0, b = 0;
        // 가로, 세로 중 큰 수를 가로로 설정
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] >= sizes[i][1]) {
                a = 0;
                b = 1;
            }
            if (sizes[i][0] < sizes[i][1]) {
                a = 1;
                b = 0;
            }
            if (sizes[i][a] > wid) {
                wid = sizes[i][a];
            }
            if (sizes[i][b] > leng) {
                leng = sizes[i][b];
            }
        }
        answer = wid * leng;
        return answer;
    }

    // 테스트 케이스
    public static void main(String[] args) {
        P86491 bf = new P86491();
        System.out.println(bf.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}})); // 4000
        System.out.println(bf.solution(new int[][]{{10, 7}, {12, 3}, {5, 15}, {7, 8}})); // 120
        System.out.println(bf.solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}})); // 133
    }
}