public class P12922 {
    public static void main(String[] args) {
        P12922 T = new P12922();
        System.out.println(T.solution(3));
        System.out.println(T.solution(4));
    }

    public String solution(int n) {
        String answer = "";
        for (int i = 0; i < n / 2; i++) {
            answer += "수박";
        }
        if (n % 2 == 0) 
            return answer;
        else {
            answer += "수";
            return answer;
        }
    }
}
