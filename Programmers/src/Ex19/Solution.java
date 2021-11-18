package Ex19;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        boolean [][][] check = new boolean[11][11][4];
        int nowX = 5;
        int nowY = 5;

        int dir_idx = -1;
        int [][] dirXY = {{0,1},{0,-1},{1,0},{-1,0}};
        
        for(int i = 0; i < dirs.length(); i++) {
        	//System.out.println(nowX + " " + nowY );
        	int nowDir = dirs.charAt(i);
        	switch(nowDir) {
        		case 'U' : dir_idx = 0; break;
	        	case 'D' : dir_idx = 1; break;
	        	case 'R' : dir_idx = 2; break;
	        	case 'L' : dir_idx = 3; break;
        	}
        	
        	int tmpX = nowX+dirXY[dir_idx][0];
        	int tmpY = nowY+dirXY[dir_idx][1];
        	
        	if(tmpX > 10 || tmpX < 0 || tmpY > 10 || tmpY < 0)
        		continue;
        	
        	if(!check[nowX][nowY][dir_idx]) {
        		answer++;
        		check[nowX][nowY][dir_idx] = true;
        		
        		int reverse_dir_idx;
        		if(dir_idx%2 == 0)
        			reverse_dir_idx = dir_idx+1;
        		else
        			reverse_dir_idx = dir_idx-1;
        		
        		check[tmpX][tmpY][reverse_dir_idx] = true;
        	}
        	
        	nowX = tmpX;
        	nowY = tmpY;
        }
        return answer;
    }
}