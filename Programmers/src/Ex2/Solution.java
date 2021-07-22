package Ex2;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {  		
    	int [] count = new int[3];
    	int max_count = 0;
    	for(int i = 0; i < answers.length; i++) {
    		if(answers[i] == i%5+1)
    			count[0]++;
    		
    		if(i % 2 == 0) {
    			if(answers[i] == 2)
    				count[1]++;
    		} else {
    			int tmp = i%8;
    			int correct=0;
    			switch(tmp) {
	    			case 1 : correct=1; break;
	    			case 3 : correct=3; break;
	    			case 5 : correct=4; break;
	    			case 7 : correct=5; break;
    			}
    			
    			if(answers[i] == correct)
    				count[1]++;
    		}
    		
    		int tmp = i%10;
    		int correct=0;
    		System.out.println(correct);
    		switch(tmp) {
	    		case 0 : correct=3; break;
				case 1 : correct=3; break;
				case 2 : correct=1; break;
				case 3 : correct=1; break;
				case 4 : correct=2; break;
				case 5 : correct=2; break;
				case 6 : correct=4; break;
				case 7 : correct=4; break;
				case 8 : correct=5; break;
				case 9 : correct=5; break;
    		}
    		if(answers[i] == correct)
    			count[2]++;
    	}
    	
    	int max = count[0];
    	for(int i = 1; i < 3; i++) {
    		if(count[i] > max)
    			max = count[i];
    	}
    	
    	ArrayList<Integer> list = new ArrayList<>();

    	for(int i = 0; i < 3; i++) {
    		if(count[i] == max)
    			list.add(i+1);
    	}
    	
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
        	answer[i] = list.get(i); 
        return answer;
    }
}