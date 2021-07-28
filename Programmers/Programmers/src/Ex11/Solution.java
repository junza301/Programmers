package Ex11;

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i = 0; i < scoville.length; i++) {
        	pq.add(scoville[i]);
        }
        
        while(pq.peek() < K && pq.size() > 1) {
        	int x = pq.poll();
        	int y = pq.poll();
        	pq.add(x+(y*2));
        	answer++;
        }
        
        if(pq.size() == 1 && pq.peek() < K)
        	return -1;
        
        return answer;
    }
}