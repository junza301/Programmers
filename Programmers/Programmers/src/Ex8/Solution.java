package Ex8;

class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        DFS(numbers, 0, 0, target);     
        return answer;
    }

	private void DFS(int[] numbers, int now, int count, int target) {
		System.out.println(now + ", " + count);
		if(count == numbers.length) {
			if(now == target)
				answer++;
			return;
		}
		
		DFS(numbers, now + numbers[count], count+1, target);
		DFS(numbers, now - numbers[count], count+1, target);
	}
}