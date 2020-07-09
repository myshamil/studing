class Solution {
    public boolean solution(int x) {
      boolean answer = true;
            int ori = x;
            int sum = 0;
            while(x!=0) {
            	sum+=x%10;
            	x = x/10;
            }
            answer = (ori%sum==0)? true : false; 
            return answer;
    }
}
