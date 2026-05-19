public class P12918 {

    public static void main(String[] args) {
        P12918 T = new P12918();
        System.out.println(T.solution("a234"));
        System.out.println(T.solution("1234"));
    }

    public boolean solution(String s) {
        if ((s.length() == 4) || (s.length() == 6)) {
            for (int i = 0; i < s.length(); i++) {
                if (('a' <= s.charAt(i)) && (s.charAt(i) <= 'z'))
                    return false;
                else if (('A' <= s.charAt(i)) && (s.charAt(i) <= 'Z'))
                    return false;
            }
            return true;
        }
        else
            return false;
    }
}