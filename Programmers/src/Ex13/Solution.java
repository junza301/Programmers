package Ex13;

import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = 3000;
        boolean [] check = new boolean[n+1];
        check[1] = true;
        for(int i = 2; i*i <= n; i++) {
        	if(!check[i]) {
        		for(int j = i+i; j <= n; j+=i) {
        			check[j] = true;
        		}
        	}
        }
        
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++) {
        	for(int j = i+1; j < nums.length-1; j++) {
        		for(int k = j+1; k < nums.length; k++) {
        			int tmp = nums[i] + nums[j] + nums[k];
        			if(!check[tmp])
        				answer++;
        		}
        	}
        }
        
        return answer;
    }
}