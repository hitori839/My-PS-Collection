public class P72410 {

    public static void main(String[] args) {
        P72410 p = new P72410();
        //System.out.println(p.solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(p.solution("z-+.^."));
        System.out.println(p.solution("=.="));
        //System.out.println(p.solution("123_.def"));
        //System.out.println(p.solution("abcdefghijklmn.p"));
    }
    
    public String solution(String new_id) {
        String temp1 = "";
        String temp2 = "";
        String answer = "";
        //1
        new_id = new_id.toLowerCase();
        //2
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        //3
        char temp = ' ';
        for (int i = 0; i < new_id.length(); i++) {
            if (new_id.charAt(i) == '.' && temp == '.') {
                continue;
            }
            else if (new_id.charAt(i) == '.' && temp != '.') {
                temp1 += new_id.charAt(i);
                temp = '.';
            }
            else {
                temp = ' ';
                temp1 += new_id.charAt(i);
            }
        }
        temp2 = temp1;
        //4
        if (temp1.charAt(0) == '.') {
            temp2 = "";
            for (int i = 1; i < temp1.length(); i++) {
                temp2 += temp1.charAt(i);
            }
        }
        temp1 = temp2;
        if (temp2.length() > 0) {
            if (temp2.charAt(temp2.length()-1) == '.') {
                temp1 = "";
                for (int i = 0; i < temp2.length()-1; i++) {
                    temp1 += temp2.charAt(i);
                }
            }
        }
        //5
        if (temp1 == "" || temp1 == " ") {
            temp1 = "a";
        }
        temp2 = temp1;
        
        //6
        if (temp1.length() >= 16) {
            temp2 = "";
            for (int i = 0; i < 15; i++) {
                temp2 += temp1.charAt(i);
            }
        }
        temp1 = temp2;
        if (temp2.length() > 0) {
            if (temp2.charAt(temp2.length()-1) == '.') {
                temp1 = "";
                for (int i = 0; i < temp2.length()-1; i++) {
                    temp1 += temp2.charAt(i);
                }
            }
        }

        //7
        if ((temp1.length() <= 2) && (temp1.length() > 0)){
            temp2 = temp1;
            for (int i = 0; i < 3-temp1.length(); i++) {
                temp2 += temp1.charAt(temp1.length()-1);
            }
            temp1 = temp2;
        }
        answer = temp1;
        return answer;
    }
}