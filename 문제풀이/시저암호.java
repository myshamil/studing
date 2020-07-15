#어려웠따 ㅠ 

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i =0; i<s.length();i++) {
            	char sch =s.charAt(i);
            	if(Character.isUpperCase(sch)) {
            		sch = (char)((sch+n-'A')%26+'A');
            	}
              else if(Character.isLowerCase(sch)) {
            		sch = (char)((sch+n-'a')%26+'a');
            	}
            answer +=sch;
            }
        
        return answer;
    }
}
