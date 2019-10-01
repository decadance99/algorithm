package day3;

import java.util.*;
import java.io.*;

public class Q5430 {

    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int testcase = Integer.parseInt(br.readLine());
        
        while (testcase-- > 0) {
            String command[] = br.readLine().split("");
            int numOfInts = Integer.parseInt(br.readLine());
            String origList = br.readLine();
            
            ArrayList<String> arr = new ArrayList<>(Arrays.asList(origList.substring(1, origList.length() - 1).split(",")));
            boolean escape = false;
            boolean isReverse = false;
            
            for (String c : command) {
            	if (escape) break;
                switch (c) {
                    case "R":
                        isReverse = !isReverse;
                        break;
                    default:
                    	System.out.println("default in");
                        if (arr.size() == 0 || numOfInts == 0) {
                        	System.out.println("in size = 0");
                            bw.write("error\n");
                            escape = true;
                        } else {
                        	System.out.println("else before remove: " + arr.toString() + arr.size());
                        	if (isReverse) arr.remove(arr.size() - 1);
                        	else arr.remove(0);
                        	System.out.println("after remove: " + arr.toString() + arr.size());
                        }
                        System.out.println("before break");
                    	break;
                }

            }
            
            if (!escape) {
                bw.write("[");
                StringBuilder temp = new StringBuilder("");
                if (isReverse) {
                    for (int i = arr.size() - 1; i >= 0; i--) {
                    	temp.append(arr.get(i));
                    	temp.append(",");
                    }
                } else {
                    for (int i = 0; i < arr.size(); i++) {
                    	temp.append(arr.get(i));
                    	temp.append(",");
                    }
                }
                System.out.println("T:" + temp);
                if (temp.length() > 0) bw.write(temp.substring(0, temp.length()-1));
                else bw.write(temp.toString());
                bw.write("]\n");
            }
        }
        bw.flush();
    }
}