public class P12926 {
    public static void main(String[] args) {
        P12926 T = new P12926();
        System.out.println(T.solution("AB", 25));
        System.out.println(T.solution("AZ", 25));
    }

    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ind = s.charAt(i);
            if ((ind >= 'a') && (ind <= 'z')) {
                ind = (char)((int)ind + n);
                if (ind > 'z') {
                    ind = (char)((int)ind - 26);
                }
                sb.append(String.valueOf(ind));
            } 
            else if ((ind >= 'A') && (ind <= 'Z')) {
                ind = (char)((int)ind + n);
                if (ind > 'Z') {
                    ind = (char)((int)ind - 26);
                }
                sb.append(String.valueOf(ind));
            }
            else {
                sb.append(String.valueOf(ind));
            }
        }
        answer = sb.toString();
        return answer;
    }
}