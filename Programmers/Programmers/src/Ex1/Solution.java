package Ex1;

import java.util.Arrays;

public class Solution {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int answer_idx = 0;
        for(int i = 0; i < commands.length; i++) {
        	int size = commands[i][1] - commands[i][0] + 1;
        	int [] tmp = new int[size];
        	int tmp_idx = 0;
        	for(int j = commands[i][0]-1; j < commands[i][1]; j++) {
        		tmp[tmp_idx++] = array[j];
        	}
        	Arrays.sort(tmp);
        	answer[answer_idx++] = tmp[commands[i][2]-1];
        }
            
        return answer;
    }
}
