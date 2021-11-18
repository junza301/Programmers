package Ex21;

import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        int n = A.length;
        int A_idx = 0;
        int B_idx = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        while(B_idx != n) {
        	if(A[A_idx] >= B[B_idx])
        		B_idx++;
        	else {
        		answer++;
        		A_idx++;
        		B_idx++;
        	}
        }
        
        return answer;
    }
}