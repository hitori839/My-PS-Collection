import java.util.Arrays;

public class P12910 {
    public static void main(String[] args) {
        P12910 T = new P12910();
        int[] t1 = {5,9,7,10};
        System.out.println(Arrays.toString(T.solution(t1, 5)));
        int[] t2 = {2, 36, 1, 3};
        System.out.println(Arrays.toString(T.solution(t2, 1)));
        int[] t3 = {3,2,6};
        System.out.println(Arrays.toString(T.solution(t3, 10)));
    }

    // 나누어 떨어지는 숫자 배열
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        // 나누어 떨어지는 숫자 배열을 저장
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % divisor) == 0) {
                int[] temp = Arrays.copyOf(answer, answer.length + 1);
                temp[temp.length-1] = arr[i];
                answer = temp;
            }
        }
        // 나누어 떨어지는 숫자가 하나도 없다면 배열에 -1을 담아 반환
        if (answer.length == 0) {
            int[] temp = Arrays.copyOf(answer, answer.length + 1);
            temp[temp.length-1] = -1;
            return temp;
        }
        // 나누어 떨어지는 숫자 배열을 오름차순으로 정렬하여 반환
        else {
            Arrays.sort(answer);
            return answer;
        }
    }
}
