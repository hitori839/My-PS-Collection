public class P12934 {
    public static void main(String[] args) {
        P12934 T = new P12934();
        //System.out.println(T.solution(121));
        System.out.println(T.solution(15));
        //System.out.println(T.solution(3));
    }

    public long solution(long n) {
        for (long i = 1; (long)i * i <= n ; i++) {
            if (i * i == n) {
                return (i+1) * (i+1);
            }
        }
        return -1l;
    }
}