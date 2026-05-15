public class P12901 {
    public static void main(String[] args) {
        P12901 T = new P12901();
        System.out.println(T.solution(5, 24));
        System.out.println(T.solution(1, 1));
    }

    public String solution(int a, int b) {
        String answer = "";
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int point = 0;
        for (int i = 0; i < a-1; i++) {
            point += month[i];
        }
        point += b;
        answer = week[(point + 4) % 7];
        return answer;
    }
}