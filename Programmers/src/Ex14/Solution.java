package Ex14;

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        int i = 0;
        int sum = 0;
        for(; i < d.length; i++) {
        	sum += d[i];
        	if(sum > budget)
        		break;
        }
        
        answer = i;
        return answer;
    }
}