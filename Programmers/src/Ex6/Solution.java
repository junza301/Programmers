package Ex6;

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for(int i = n; i > 0; i--) {
        	if(citations[n-i] >= i) {
        		if(n-i != 0) {
        			if(citations[n-i-1] <= i)
        				return i;
        		} else {
        			return i;
        		}
        	}
        }
        return 0;
    }
}