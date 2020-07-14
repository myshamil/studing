import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public boolean solution(String s) {
        boolean answer = false;
            Pattern p = Pattern.compile("^[0-9]*$");
            Matcher m = p.matcher(s);
            //문자열 s의 길이 4 혹은 6, 숫자로만 이루어져 있는지
            if (s.length()==4 || s.length()==6) {
            	answer= m.find();
            }
            return answer;
    }
}
