public class P12935 {
    public static void main(String[] args) {
        P12935 T = new P12935();
        System.out.println(T.solution(new int[] {4,3,2,1}));
        System.out.println(T.solution(new int[] {10}));
    }

    public int[] solution(int[] arr) {
        int ind = 0;
        int ind_2 = 0;
        int[] answer = new int[arr.length - 1];
        if ((arr.length - 1) == 0) {
            int [] an2 = {-1};
            return an2;
        } 
        for (int i = 0; i < arr.length; i++) {
            if (arr[ind] > arr[i]) {
                ind = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == ind) {
                continue;
            }
            answer[ind_2] = arr[i];
            ind_2 += 1;
        }
        return answer;
    }
}