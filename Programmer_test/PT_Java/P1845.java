import java.util.HashMap;
import java.util.Map;

// 폰켓몬
public class P1845 {
    public static void main(String[] args) {
        P1845 p = new P1845();
        System.out.println(p.solution(new int[]{3, 1, 2, 3}));
    }

    public int solution(int[] nums) {
        // nums의 길이의 절반보다 많은 종류의 폰켓몬을 가져갈 수 없으므로,
        // nums의 길이의 절반과 pok의 크기를 비교하여 작은 값을 반환    
        Map<Integer, Integer> pok = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (pok.containsKey(nums[i])){
                int j = pok.get(nums[i]);
                pok.put(nums[i], j+1);
            }
            else {
                pok.put(nums[i], 1);
            }
        }
        // nums의 길이의 절반과 pok의 크기를 비교하여 작은 값을 반환한다.
        int k = nums.length/2;
        if (k <= pok.size()) {
            return k;
        }
        else {
            return pok.size();
        }
    }
}