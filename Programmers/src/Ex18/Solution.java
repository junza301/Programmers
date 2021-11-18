package Ex18;

import java.util.ArrayList;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        ArrayList<Character> Skill = new ArrayList<>();
        for(int i = 0; i < skill.length(); i++)
        	Skill.add(skill.charAt(i));
        
        
        for(int i = 0; i < skill_trees.length; i++) {
        	int musthave_idx = 0;
        	boolean check = true;
        	for(int j = 0; j < skill_trees[i].length(); j++) {
        		char now_skill = skill_trees[i].charAt(j);
        		if(Skill.contains(now_skill) && now_skill != Skill.get(musthave_idx)) {
        			check = false;
        			break;
        		} else if(now_skill == Skill.get(musthave_idx)) {
        			musthave_idx++;
        			if(musthave_idx == Skill.size())
        				break;
        		}
        	}
        	if(check)
        		answer++;
        }
        
        
        return answer;
    }
}