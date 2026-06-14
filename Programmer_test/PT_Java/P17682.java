public class P17682 {
    public static void main(String[] args) {
        P17682 T = new P17682();
        // 테스트 케이스 실행 및 결과 출력
        System.out.println(T.solution("1S2D*3T"));   // 37
        System.out.println(T.solution("1D2S#10S"));  // 9
        System.out.println(T.solution("1D2S0T"));   // 3
        System.out.println(T.solution("1S*2T*3S"));  // 23
        System.out.println(T.solution("1D#2S*3S"));  // 5
        System.out.println(T.solution("1T2D3D#"));   // -4
        System.out.println(T.solution("1D2S3T*"));   // 59
    }

    public int solution(String dartResult) {
        int answer = 0;
        int[] temp = {0, 0, 0}; // 3번의 기회에서 얻은 점수를 각각 저장할 배열
        int t_ind = -1;         // 현재 몇 번째 기회(배열의 인덱스)인지를 나타내는 변수

        // 문자열을 한 글자씩 순회하며 분석
        for (int i = 0; i < dartResult.length(); i++) {
            char ind = dartResult.charAt(i); // 현재 가리키는 문자

            // 1. 숫자인 경우 ('0' ~ '9')
            if (('0' <= ind) && (ind <= '9')) {
                t_ind += 1; // 새로운 점수가 시작되었으므로 점수 인덱스 증가 (0, 1, 2 순으로 진행)
                temp[t_ind] = ind - '0'; // 문자(char)를 정수(int)로 변환하여 저장

                // 다음 문자가 '0'인지 확인하여 점수가 '10'인 경우를 예외 처리
                if (dartResult.charAt(i+1) == '0') {
                    i++; // '0'까지 처리했으므로 인덱스를 하나 건너뜀
                    temp[t_ind] = 10; // 점수를 10으로 갱신
                }
            }
            // 2. 보너스(S, D, T) 또는 옵션(*, #)인 경우
            else {
                if (ind == 'S')      // Single: 1제곱 (그대로)
                    temp[t_ind] = Sin(temp[t_ind]);
                else if (ind == 'D') // Double: 2제곱
                    temp[t_ind] = Dou(temp[t_ind]);
                else if (ind == 'T') // Triple: 3제곱
                    temp[t_ind] = Tri(temp[t_ind]);
                
                else if (ind == '*') { // 스타상(*): 현재 점수와 바로 전 점수를 각각 2배로
                    if (t_ind >= 1) {  // 현재가 2번째나 3번째 기회일 때 (이전 점수가 존재할 때)
                        temp[t_ind] = Star(temp[t_ind]);     // 현재 점수 2배
                        temp[t_ind-1] = Star(temp[t_ind-1]); // 이전 점수 2배
                    }
                    else {             // 현재가 첫 번째 기회일 때 (이전 점수가 없을 때)
                        temp[t_ind] = Star(temp[t_ind]);     // 현재 점수만 2배
                    }
                }
                else if (ind == '#')   // 아차상(#): 해당 점수를 마이너스로 변환
                    temp[t_ind] = Hash(temp[t_ind]);
            }
        }

        // 배열에 저장된 3번의 기회 점수를 모두 더함
        for (int i = 0; i < 3; i++) {
            answer += temp[i];
        }
        
        return answer; // 최종 점수 반환
    }

    // Single 점수 계산 메서드 (1제곱)
    public int Sin(int m) {
        return m;
    }

    // Double 점수 계산 메서드 (2제곱)
    public int Dou(int m) {
        return m * m;
    }

    // Triple 점수 계산 메서드 (3제곱)
    public int Tri(int m) {
        return m * (m * m);
    }

    // 스타상(*) 계산 메서드 (2배)
    public int Star(int m) {
        return m * 2;
    }

    // 아차상(#) 계산 메서드 (마이너스)
    public int Hash(int m) {
        return (-1) * m;
    }
}