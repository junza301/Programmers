package Ex7;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
    	for(int i = 1; i*i <= yellow; i++) {
    		if(yellow%i == 0) {
    			int tmp = yellow / i;
    			if(brown == ((tmp+2) * (i+2)) - yellow) {
    				answer[0] = Math.max(tmp+2, i+2);
    				answer[1] = Math.min(tmp+2, i+2);
    				break;
    			}
    		}
    	}

        return answer;
    }
}