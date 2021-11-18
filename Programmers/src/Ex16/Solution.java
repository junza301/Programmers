package Ex16;

import java.util.ArrayList;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> check = new ArrayList<>();
        int count = 0;
        boolean correct = true;
        
        count++;
        check.add(words[0]);
    
        for(int i = 1; i < words.length; i++) {
        	String now = words[i];
        	String prev = check.get(count-1);
        	count++;

        	if(check.contains(now)) {
        		correct = false;
        		break;
        	}
        	if(prev.charAt(prev.length()-1) != now.charAt(0)) {
        		correct = false;
        		break;
        	}
        	check.add(words[i]);
        }
        
        if(correct) {
        	answer[0] = 0;
        	answer[1] = 0;
        } else {
        	int tmp1 = count % n;
        	int tmp2 = count / n + 1;
        	if(tmp1 == 0) {
        		tmp1 = n;
        		tmp2--;
        	}
        	answer[0] = tmp1;
        	answer[1] = tmp2;
        }
        
        return answer;
    }
}