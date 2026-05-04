import java.util.*;

public class P42895 {

    public static void main(String[] args) {
        P42895 sol = new P42895();
        System.out.println(sol.solution(5, 12)); // 4
        System.out.println(sol.solution(2, 11)); // 3
    }
    
    public int solution(int N, int number) {
        if (N == number) return 1;
        
        ArrayList<HashSet<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list.add(new HashSet<>());
        }
        
        int nn = 0;
        for (int i = 1; i < 9; i++) {
            nn = nn*10 + N;
            list.get(i).add(nn);
            
            for (int j = 1; j < i; j++) {
                for (int op1 : list.get(j)) {
                    for (int op2 : list.get(i-j)) {
                        list.get(i).add(op1 + op2);
                        list.get(i).add(op1 - op2);
                        list.get(i).add(op1 * op2);
                        if (op2 != 0)
                            list.get(i).add(op1 / op2);
                    }
                }
            }
            if (list.get(i).contains(number)) {
                return i;
            }
        }
        return -1;
    }
}
