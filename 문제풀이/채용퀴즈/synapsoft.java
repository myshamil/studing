package studytest;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

//https://www.synapsoft.co.kr/recruit-developer
public class synapsoft {
	//로마숫자를 아라비아로...
	public int romanToInt(String s) {
		int num =0;
		int len = s.length();
		
		for (int i =0; i<len; i++) {
			char ch = s.charAt(i);
			char nextCh = s.charAt(i+1);
			
			if(ch=='X') {
				num += 10;
			}else if (ch=='V') {
				num +=5;
			}else if (ch=='I') {
				if(nextCh=='X') {
					num +=9;					
				}else if(nextCh=='V') {
					num+=4;
				}else {
					num++;
				}
			}
		}
		return num;
	}
	// 아라비아 숫자를 로마숫자로 ..는 몰라서 참고함 ㅠ 모르겟음
	public String intToRoman(int num) {
		LinkedHashMap<String, Integer> roman = new LinkedHashMap<>();
		roman.put("I", 1);
		roman.put("II", 2);
		roman.put("III", 3);
		roman.put("IV", 4);
		roman.put("V", 5);
		roman.put("IX", 9);
		roman.put("X", 10);
		
		String res = "";
		for(Map.Entry<String, Integer> entry: roman.entrySet()) {
			int matches = num/entry.getValue();
			res+=repeat(entry.getKey(),matches);
			num = num % entry.getValue();
		}
		return res;
	}
	public static String repeat(String s, int n) {
		if(s== null) {
			return null;
		}else {
			StringBuilder sb = new StringBuilder();
			for (int i =0; i<n; i++) {
				sb.append(s);
			}
			return sb.toString();
		}
	}
	
	public static void main(String[] args) {
		

		
	}

}
