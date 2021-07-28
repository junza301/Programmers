package Ex4;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] prices) {
    	int [] count = new int[prices.length];
    	Queue<Integer> q = new LinkedList<>();
    	
    	for(int i = 0; i < prices.length; i++) {
    		int size = q.size();
    		for(int j = 0; j < size; j++) {
    			int now = q.poll();
    			if(prices[now] <= prices[i]) {
    				count[now]++;
    				q.add(now);
    			}
    		}
    		q.add(i);
    	}
    	
    	for(int i = 0; i < count.length; i++) {
    		if(count[i] != count.length-1-i)
    			count[i]++;
    	}
 	
        int[] answer = count.clone();
        return answer;
    }
}