import java.util.*;
class Solution {
         public int[] solution(int[] answers) {
	        int[] answer = {};
	        
	        int[] stu1 = {1,2,3,4,5};
	        int[] stu2 = {2,1,2,3,2,4,2,5};
	        int[] stu3 = {3,3,1,1,2,2,4,4,5,5};
	        
	        int[] count = new int[3];
	        
	        for(int i =0; i<= answers.length; i++) {
	        	if(stu1[i%5]==answer[i]) {
	        		count[0] += 1;
	        	}
	        	if(stu2[i%8] == answer[i]) {
	        		count[1] += 1;
	        	}
	        	if(stu3[i%10] == answer[i]) {
	        		count[2] += 1;
	        	} 
	        }
	        int max = 0;
	        for(int i =0; i<=2 ; i++){
	            if(count[i]>max){
	                max = count[i];
	            }
	        }    
	        List<Integer> win = new LinkedList <>();
	        
	        for(int i =0; i<count.length; i++) {
	        	if(max == count[i]) {
	        		win.add(i);
	        	}
	        }

	        int[] ans = new int[win.size()];
	        for (int i =0; i<ans.length;i++) {
	        	ans[i] = win.get(i);
	        }
	        return ans;
	    }
}
