class Solution {
    public int solution(int n) {
        int answer = 0;
         int[] num = new int [n+1];
		
		for(int i=2;i<=n; i++) {
			num[i] = i; //배열에 2부터 n까지 집어넣기 첨부터 넣으려다 뒤에서 헷갈려서 그냥 2에 2넣고 3에 3넣고 하기로.	
		}
		
		for(int i = 2; i<=n; i++) {
			
			for(int j = i*2; j<=n; j +=i) { //i의 배수를 다 0으로 만들기
				num[j] = 0;
			}
		}
		for (int i =0; i<=n; i++) {
			if(num[i]!=0) {
				answer++;
			}
		}        
        return answer;
    }   
}
