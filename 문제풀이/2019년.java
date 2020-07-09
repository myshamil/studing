import java.util.Calendar;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
            Calendar cal = Calendar.getInstance();
            String[] arr = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
                   
            cal.set(Calendar.YEAR,2016);
            cal.set(Calendar.MONTH,a-1);
            cal.set(Calendar.DATE,b);
            
            answer =arr[cal.get(Calendar.DAY_OF_WEEK)-1];
            return answer;
    }
}
#Calendar 사용해봤다!
