public class P12919 {
    public static void main(String[] args) {
        P12919 T = new P12919();
        String[] ex = {"Jane", "Kim"};
        System.out.println(T.solution(ex));
    }

    public String solution(String[] seoul) {
        int a = -1;
        for (int i = 0; i < seoul.length ; i++) {
            if (seoul[i].equals("Kim")) {
                a = i;
                break;
            }
        }
        return "김서방은 " + a + "에 있다";
    }
}