public class P12921 {
    public static void main(String[] args) {
        P12921 T = new P12921();
        System.out.println(T.solution(10));
        System.out.println(T.solution(5));
        System.out.println(T.solution(1000000));
    }

    public int solution(int n) {
        int answer = 1;
        int yn = 0;
        int[] a = {2};
        for (int i = 3; i <= n; i++) {
            yn = 0;
            for (int j = 0; j < a.length; j++) {
                if (i % a[j] == 0) {
                    yn = 1;
                    break;
                }
            }
            if (yn == 1)
                continue;
            else {
                answer += 1;
                int[] temp = new int[a.length + 1];
                for (int j = 0; j < a.length; j++) {
                    temp[j] = a[j];
                }
                temp[a.length] = i;
                a = temp;
            }
        }
        return answer;
    }
}
