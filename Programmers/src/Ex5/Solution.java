package Ex5;

import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
    	Arrays.sort(participant);
    	Arrays.sort(completion);
    	
    	int i = 0;
    	for(; i < completion.length; i++) {
    		if(!participant[i].equals(completion[i])) {
    			return participant[i];
    		}
    	}

    	return participant[i];
    }
}