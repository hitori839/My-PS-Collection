import java.util.Arrays;

public class P68936 {

    int[] answer = {0,0};

    public static void main(String[] args) {
        P68936 T = new P68936();
        System.out.println(Arrays.toString(T.solution(new int[][] {{1,1},{1,0}})));
        System.out.println(Arrays.toString(T.solution(new int[][] {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}})));
        System.out.println(Arrays.toString(T.solution(new int[][] {{1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1},{0,1,0,0,1,1,1,1},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1},{0,0,0,0,1,0,0,1},{0,0,0,0,1,1,1,1}})));
    }

    public int[] solution(int[][] arr) {
        for (int i = 0; i < 2; i++)
            answer[i] = 0;
        Check(arr);
        return answer;
    }

    public void Check(int[][] arr) {
        if (arr.length == 1){
            answer[arr[0][0]] += 1;
            arr[0][0] = 2;
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if ((arr[0][0] != arr[i][j]) && (arr[0][0] != 2)) {
                        Slice(arr);
                        return;
                    }
                }
            }
            answer[arr[0][0]] += 1;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = 2;
                }
            }
        }
    }

    public void Slice(int[][] arr) {
        int half = arr.length / 2;
        int[][] sliced = new int[half][half];
        for (int i = 0; i < half; i++) {
            sliced[i] = Arrays.copyOfRange(arr[i], 0, half);
        }
        Check(sliced);
        for (int i = half; i < arr.length; i++) {
            sliced[i - half] = Arrays.copyOfRange(arr[i], 0, half);
        }
        Check(sliced);
        for (int i = 0; i < half; i++) {
            sliced[i] = Arrays.copyOfRange(arr[i], half, arr.length);
        }
        Check(sliced);
        for (int i = half; i < arr.length; i++) {
            sliced[i - half] = Arrays.copyOfRange(arr[i], half, arr.length);
        }
        Check(sliced);
    }
}
