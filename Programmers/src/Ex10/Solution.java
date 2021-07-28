package Ex10;

import java.util.Arrays;

class Solution {
	int [][] graph;
	boolean [] check;
	int min = Integer.MAX_VALUE;
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        graph = new int[words.length][words.length];
        check = new boolean[words.length];
        
        for(int i = 0; i < words.length; i++) {
        	for(int j = i; j < words.length; j++) {
        		if(i==j) {
        			graph[i][j] = 1;
        			continue;
        		}
        		
        		int count = search_connection(words[i], words[j]);
        		if(count == 1) {
        			graph[i][j] = 1;
        			graph[j][i] = 1;
        		}
        	}
        }
        
        for(int i = 0; i < words.length; i++) {
        	if(search_connection(begin, words[i]) == 1) {
        		Arrays.fill(check, false);
        		DFS(words, i, target, 1);
        	}
        }
       
        if(min == Integer.MAX_VALUE)
        	min = 0;
        
        return min;
    }

	private void DFS(String[] words, int now, String target, int count) {
		check[now] = true;
		System.out.println(words[now]);
		if(words[now].equals(target)) {
			min = Math.min(count, min);
			check[now] = false;
			return;
		}
		
		for(int k = 0; k < words.length; k++) {
			if(graph[now][k] == 1 && !check[k]) {
				DFS(words, k, target, count+1);
			}
		}
		check[now] = false;
	}

	private int search_connection(String i, String j) {
		int count = 0;
		for(int k = 0; k < i.length(); k++) {
			if(i.charAt(k) != j.charAt(k))
				count++;
		}
		return count;
	}
}