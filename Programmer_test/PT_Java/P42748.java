import java.util.Arrays;

public class P42748 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        P42748 s = new P42748();
        int[] answer = s.solution(array, commands);
        for (int i : answer) {            
            System.out.println(i);
        }
    }

    public int[] solution(int[] array, int[][] commands) {
        // commands의 길이만큼 answer 배열을 만들어준다.
        int[] answer = new int[commands.length];

        // commands의 길이만큼 반복문을 돌려준다.
        for (int i = 0; i < commands.length; i++) {
            int[] a = {};
            // array의 commands[i][0]번째부터 commands[i][1]번째까지 자른 배열을 만들어준다.
            a = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            // 자른 배열을 정렬해준다.
            Arrays.sort(a);
            // 정렬된 배열의 commands[i][2]번째 수를 answer 배열에 넣어준다.
            answer[i] = a[commands[i][2]-1];
        }
        return answer;
    }
}
