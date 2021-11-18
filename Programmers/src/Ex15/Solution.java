package Ex15;

class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        
        int [][] graph = new int[N+1][N+1];
        for(int i = 0; i < road.length; i++) {
        	int x = road[i][0];
        	int y = road[i][1];
        	int dis = road[i][2];
        	
        	if(graph[x][y] != 0) {
        		graph[x][y] = Math.min(graph[x][y], dis);
        		graph[y][x] = Math.min(graph[y][x], dis);
        	} else {	
	        	graph[x][y] = dis;
	        	graph[y][x] = dis;
        	}
        }
        
        int [] distance = new int[N+1];
        for(int i = 1; i <= N; i++) {
        	distance[i] = Integer.MAX_VALUE;
        }
        
        boolean [] check = new boolean[N+1];
        
        distance[1] = 0;
        check[1] = true;
        
        for(int i = 1; i <= N; i++) {
        	if(!check[i] && graph[1][i] != 0)
        		distance[i] = graph[1][i];
        }
        
        for(int i = 0; i < N-1; i++) {
        	int min = Integer.MAX_VALUE;
        	int min_idx = -1;
        	
        	for(int j = 1; j <= N; j++) {
        		if(!check[j] && distance[j] != Integer.MAX_VALUE) {
        			if(distance[j] < min) {
        				min = distance[j];
        				min_idx = j;
        			}
        		}
        	}
        	
        	check[min_idx] = true;
        	for(int j = 1; j <= N; j++) {
        		if(!check[j] && graph[min_idx][j] != 0) {
        			distance[j] = Math.min(distance[j], distance[min_idx]+graph[min_idx][j]);
        		}
        	}
        }
        
        for(int i = 1; i <= N; i++) {
        	if(distance[i] <= K)
        		answer++;
        }

        return answer;
    }
}