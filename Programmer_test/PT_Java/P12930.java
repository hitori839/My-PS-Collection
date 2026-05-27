public class P12930 {
    public static void main(String[] args) {
        P12930 T = new P12930();
        System.out.println(T.solution("try hello world"));
    }

    public String solution(String s) {
        StringBuilder sb1 = new StringBuilder();
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                temp = 0;
                sb1.append(" ");
            }
            else {
                if ((temp % 2) == 0) {
                    sb1.append(Character.toUpperCase(s.charAt(i)));
                }
                else {
                    sb1.append(Character.toLowerCase(s.charAt(i)));
                }
                temp += 1;
            }
        }
        return sb1.toString();
    }
}