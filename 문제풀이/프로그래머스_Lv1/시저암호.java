class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i =0; i<s.length();i++) {
            	char sch =s.charAt(i);
            	if(Character.isUpperCase(sch)) {
            		sch = (char)((sch+n-65)%26+65);
            	}else if(Character.isLowerCase(sch)) {
            		sch = (char)((sch+n-97)%26+97);
            	}
            answer +=sch;
            }
        
        return answer;
    }
}
