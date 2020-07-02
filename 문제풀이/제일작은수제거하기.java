import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer ={};
        int min = arr[0];
        List<Integer> list = new ArrayList();
        
        if (arr.length <=1){
            answer = new int[]{-1};
        }else{
            for (int i=0; i<arr.length; i++){//가장 작은 수 찾기
                if(min>arr[i]){
                    min = arr[i];
                }    
            }
            //비교해서 담기
            for (int i =0; i<arr.length; i++){
                if(min <arr[i]){
                	list.add(arr[i]);
                }
            }
           answer = new int[list.size()];
            
           for(int i=0; i<list.size(); i++) {
           	answer[i]=list.get(i);
           }
        }
        return answer;
    }
	
	

}
