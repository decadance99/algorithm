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
				  //���ÿ� �ִ� ���ڰ� ���߹��ڿ��� ù ���ڿ� ���� && ������ ũ�Ⱑ ���߹��ڿ��� ũ�⺸�� ũ�ų� ������
				  isBomb = true; //isBomb �� true�� �ΰ�
				  for (int j = 0; j < bomb.length(); j++) {
					  //���߹��ڿ��� ù ���ں��� �� ���̸�ŭ �˻�
					  if (bomb.charAt(j) != s.get(s.size()-1-j)) {
						  //���߹��ڿ��� j ��ġ�� ���� vs ���ÿ� ���� ���ڿ��� ���� ũ��-1-j ��ġ�� ���� => Ʋ����
						  isBomb = false; //isBomb �� false
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