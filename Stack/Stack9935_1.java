package day5;
import java.util.*;

public class Stack9935_1{
	
	static int idx = 0;
	static char[] ans = new char[1000001], bomb = new char[1000001];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(); //���ڿ�
        String temp  = sc.next(); //����
        int len = temp.length(); //������ ����
        
        for(int i = 0; i < temp.length(); i++)
            bomb[i] = temp.charAt(i); //������ ����Ʈ�� ���� char�� ��� ��
        
        for(int i = 0; i < a.length(); i++) { //���ڿ��� ���̸�ŭ
            ans[idx++] = a.charAt(i); //ans�� ���ڿ��� char�� �־� ��
            if (ans[idx - 1] == bomb[len - 1]){ //ans�� �� ���ڰ� ������ ���� �� ���ڶ� ������
                if (idx - len < 0) continue; //idx�� ���� ���̺��� ª���� �н�
                boolean c = false; // c�� false�� ����
                for(int j = 0; j < len; j++) { //���� ���̸�ŭ
                    if (ans[idx - 1 - j] != bomb[len - 1 - j]){ //ans�� �ڿ� ������ �� �˻��ؼ� ���� ���� ������
                        c = true; //c�� true�� ����
                        break; //for�� Ż��
                    }
                }
                if(!c) idx -= len; //c�� false�̸� idx���� ������ ���̸�ŭ �� ��
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