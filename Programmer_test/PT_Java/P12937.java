public class P12937 {
    public static void main(String[] args) {
        P12937 T = new P12937();
        System.out.println(T.solution(13));
    }

    public String solution(int num) {
        if (num % 2 == 0)
            return "Even";
        else
            return "Odd";
    }
}