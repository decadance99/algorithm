package day5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack9935 {

	  public static void main(String[] args) throws Exception {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  String input = br.readLine();
		  String bomb = br.readLine();
	 
		  Stack<Character>s = new Stack<Character>();
		  
		  for (int i = input.length()-1; i >= 0; i--) {
			  boolean isBomb = false;
			  s.push(input.charAt(i));
			  
			  if (input.charAt(i) == bomb.charAt(0) && s.size() >= bomb.length()) {
				  //스택에 넣는 문자가 폭발문자열의 첫 문자와 같고 && 스택의 크기가 폭발문자열의 크기보다 크거나 같으면
				  isBomb = true; //isBomb 값 true로 두고
				  for (int j = 0; j < bomb.length(); j++) {
					  //폭발문자열의 첫 문자부터 그 길이만큼 검사
					  if (bomb.charAt(j) != s.get(s.size()-1-j)) {
						  //폭발문자열의 j 위치의 문자 vs 스택에 쌓인 문자열의 스택 크기-1-j 위치의 문자 => 틀리면
						  isBomb = false; //isBomb 값 false
						  break;
					  }
				  }
				  if (isBomb) {
					  for (int k = 0; k < bomb.length(); k++) {
						  s.pop();
					  }
				  }
			  }
		  }
		  
		  StringBuffer sb = new StringBuffer();
		  if (s.isEmpty()) System.out.println("FRULA");
		  else {
			  for (int i = s.size(); i > 0; i--) {
				  sb.append(s.pop());
			  }
		  }
		  System.out.println(sb);
	  }
}