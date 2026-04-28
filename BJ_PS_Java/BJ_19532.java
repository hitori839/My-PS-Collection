import java.util.Scanner;

public class BJ_19532 {
    public static void main(String[] args) {
        int in[] = new int[6];
        int a, b, c, e, f;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            in[i] = sc.nextInt();
        }
        a = in[0] * in[3];
        b = in[1] * in[3] ;
        c = in[2] * in[3];
        e = in[4] * in[0];
        f = in[5] * in[0];
        int y = (c - f) / (b - e);
        int x = (c - b * y) / a;
        System.out.println(x + " " + y);
    }
}
