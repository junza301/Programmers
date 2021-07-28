package Ex12;

import java.util.PriorityQueue;

class Solution {
    public int solution(int[][] jobs) {
        
        PriorityQueue<Integer> pt = new PriorityQueue<Integer>();

        int time = 0;
        int now_task = 0;  
        int total_task = 0;
        int processed_task = 0;
        int total_wait = 0;
        
        while(processed_task != jobs.length) {
        	if(now_task != 0) {
        		now_task--;
        		if(now_task == 0)
        			processed_task++;
        	}
        	total_wait += pt.size();
        		
        	if(total_task != jobs.length) {
	        	for(int i = 0; i < jobs.length; i++)
	        		if(jobs[i][0] == time) {
	        			pt.add(jobs[i][1]);
	        			total_task++;
	        		}
        	}
        	
        	
        	
        	
        	if(now_task == 0 && !pt.isEmpty())
        		now_task = pt.poll();
        	  
        	time++;
        }
        
        for(int i = 0; i < jobs.length; i++) {
        	total_wait += jobs[i][1];
        }
         
        return (int)(total_wait / jobs.length);
    }
}