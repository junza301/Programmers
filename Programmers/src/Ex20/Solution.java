package Ex20;

class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int now = 1;
        int count = 0;
        int wSum = w*2+1;
        
        boolean [] check = new boolean[n+1];
        for(int i = 0; i < stations.length; i++) {
        	check[stations[i]] = true;
        	for(int j = 1; j <= w; j++) {
        		if(stations[i]-j >= 0)
        			check[stations[i]-j] = true;
        		if(stations[i]+j < n)
        			check[stations[i]+j] = true;
        	}
        }
        
        now = search_false(now, check);
        while(now <= n) {
        	count++;
        	now++;
        	if(now > n || check[now]) {
        		System.out.println(count);
        		if(count % wSum == 0)
        			answer = answer + (count/wSum);
        		else
        			answer = answer + (count/wSum+1);
        		now = search_false(now, check);
        		count = 0;
        	}
        }

        return answer;
    }

	private int search_false(int now, boolean[] check) {
		for(; now < check.length; now++)
			if(!check[now])
				break;
		return now;
	}
}