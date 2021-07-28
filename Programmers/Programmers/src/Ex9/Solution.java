package Ex9;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean [] check = new boolean[n];
        
        for(int i = 0; i < n; i++) {
        	if(!check[i]) {
    			DFS(computers, check, i, n);
    			answer++;
    		}
        }
        
        return answer;
    }

	private void DFS(int[][] computers, boolean[] check, int i, int n) {
		check[i] = true;
		
		for(int j = 0; j < n; j++) {
			if(!check[j] && computers[i][j] == 1)
				DFS(computers, check, j, n);
		}
	}
}