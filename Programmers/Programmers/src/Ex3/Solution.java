package Ex3;

class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
    	while(n != 0) {
    		int Vtmp = n/3;
    		int Mtmp = n%3;
    		
    		switch(Mtmp) {
	    		case 1 : Mtmp = 1; break;
	    		case 2 : Mtmp = 2; break;
	    		case 0 : Mtmp = 4; break;
    		}
    		sb.insert(0, Mtmp);
    		
    		if(Mtmp == 4)
    			n = (n/3)-1;
    		else
    			n/=3;
    	}
    	answer = sb.toString();
        return answer;
    }
}