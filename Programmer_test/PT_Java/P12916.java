public class P12916 {
    public static void main(String[] args) {
        P12916 T = new P12916();
        System.out.println(T.solution("pPoooyY"));
        System.out.println(T.solution("Pyy"));
        System.out.println(T.solution("AAA"));
    }

    boolean solution(String s) {
        int ep = 0;
        int ey = 0;

        // String을 하나씩 돌면서 p와 y 확인
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == 'p') || (s.charAt(i) == 'P'))
                ep += 1;
            if ((s.charAt(i) == 'y') || (s.charAt(i) == 'Y'))
                ey += 1;
        }

        // 개수가 같으면 true 아니면 false 리턴
        if (ep == ey)
            return true;
        else
            return false;
    }
}