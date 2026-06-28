import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class P12946 {
    public static void main(String[] args) {
        P12946 T = new P12946();
        System.out.println(Arrays.deepToString(T.solution(2)));
    }

    List<int[]> answer = new ArrayList<>();

    public int[][] solution(int n) {
        hanoi(n, 1, 3, 2);
        return answer.toArray(new int[0][0]);
    }

    // disks = 디스트 수,
    // start = 몇 번 기둥에서 시작하는지
    // end = 몇 번 기둥에서 끝나는지
    // mid = 거치는 기둥
    public void hanoi(int disks, int start, int end, int mid) {
        if (disks == 1) {
            answer.add(new int[] {start, end});
        }
        else {
            hanoi(disks - 1, start, mid, end);
            answer.add(new int[] {start, end});
            hanoi(disks - 1, mid, end, start);
        }
    }
}
