package day5;
import java.util.*;

public class Stack9935_1{
	
	static int idx = 0;
	static char[] ans = new char[1000001], bomb = new char[1000001];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(); //문자열
        String temp  = sc.next(); //폭발
        int len = temp.length(); //폭발의 길이
        
        for(int i = 0; i < temp.length(); i++)
            bomb[i] = temp.charAt(i); //폭발을 리스트에 각각 char로 담아 줌
        
        for(int i = 0; i < a.length(); i++) { //문자열의 길이만큼
            ans[idx++] = a.charAt(i); //ans에 문자열을 char로 넣어 줌
            if (ans[idx - 1] == bomb[len - 1]){ //ans에 들어간 문자가 폭발의 가장 뒤 문자랑 같으면
                if (idx - len < 0) continue; //idx가 폭발 길이보다 짧으면 패스
                boolean c = false; // c를 false로 설정
                for(int j = 0; j < len; j++) { //폭발 길이만큼
                    if (ans[idx - 1 - j] != bomb[len - 1 - j]){ //ans의 뒤와 폭발의 뒤 검사해서 서로 같지 않으면
                        c = true; //c를 true로 설정
                        break; //for문 탈출
                    }
                }
                if(!c) idx -= len; //c가 false이면 idx에서 폭발의 길이만큼 빼 줌
            }
        }
        if(idx == 0) System.out.println("FRULA");
        else {
            for(int i = 0; i < idx; i++)
                System.out.print(ans[i]);
        }
        sc.close();
    }
}