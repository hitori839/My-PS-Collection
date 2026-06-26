public class P120860 {
    public static void main(String[] args) {
        P120860 T = new P120860();
        System.out.println(T.solution(new int[][] {{1,1}, {2,1}, {2,2}, {1,2}}));
        System.out.println(T.solution(new int[][] {{-1,-1}, {1,1}, {1,-1}, {-1,1}}));
    }  

    public int solution(int[][] dots) {
        int ma_x = dots[0][0];
        int mi_x = dots[0][0];
        int ma_y = dots[0][1];
        int mi_y = dots[0][1];
    
        for (int i = 1; i < 4; i++) {
            if (ma_x < dots[i][0]) 
                ma_x = dots[i][0];
            if (mi_x > dots[i][0]) 
                mi_x = dots[i][0];
            if (ma_y < dots[i][1]) 
                ma_y = dots[i][1];
            if (mi_y > dots[i][1]) 
                mi_y = dots[i][1];
        }
        return (ma_x - mi_x) * (ma_y - mi_y);
    }
}