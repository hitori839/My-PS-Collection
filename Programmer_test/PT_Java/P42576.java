// 완주하지 못한 선수
import java.util.HashMap;
import java.util.Map;

public class P42576 {
    public static void main(String[] args) {
       String [] participant = {"leo", "kiki", "eden"};
       String [] completion = {"eden", "kiki"};
       P42576 p42576 = new P42576();
       System.out.println(p42576.solution(participant, completion));
    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // HashMap을 사용하여 참가자와 완주자의 이름과 개수를 저장
        Map<String, Integer> map = new HashMap<>();

        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        // 완주자 목록을 순회하면서 참가자 목록에서 해당 이름의 개수를 감소
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        // HashMap을 순회하면서 개수가 0이 아닌 이름을 찾음
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }
}