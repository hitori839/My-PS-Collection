public class P81301 {

    public static void main(String[] args) {
        P81301 T = new P81301();
        System.out.println(T.solution("one4seveneight"));
        System.out.println(T.solution("23four5six7"));
        System.out.println(T.solution("2three45sixseven"));
        System.out.println(T.solution("123"));
    }

    public int solution(String s) {
        int answer = 0;
        
        String[] word = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero"};
        String[] number = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        
        String temp = s;
        for (int i = 0; i < 10; i++) {
            temp = temp.replace(word[i], number[i]);
        }
        
        answer = Integer.valueOf(temp);
        
        return answer;
    }
}