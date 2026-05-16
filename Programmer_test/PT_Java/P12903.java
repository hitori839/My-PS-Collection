public class P12903 {
    public static void main(String[] args) {
        P12903 T = new P12903();
        String a = "abcde";
        String b = "qwer";
        System.out.println(T.solution(a));
        System.out.println(T.solution(b));
    }

    public String solution(String s) {
        String answer = "";
        if ((s.length() % 2) == 1) {
            answer = s.substring((s.length()) / 2, ((s.length()) / 2) + 1 );
        }
        else {
            answer = s.substring((s.length() / 2) - 1 , ((s.length() / 2) + 1));
        }
        return answer;
    }
}