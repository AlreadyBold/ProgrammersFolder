import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
       int[] answer = new int [commands.length];
		 List<Integer> arr = new ArrayList<>();
	        for(int i = 0 ; i<commands.length; i++ ){
                if(!(commands[i][0] == commands[i][1])) {
	                for(int j = commands[i][0]-1; j<commands[i][1]; j++){
	                    arr.add(array[j]);
	                }
	                Collections.sort(arr);
	                answer[i] = arr.get(commands[i][2]-1).intValue();
	                arr.clear();
	            } else {
                    answer[i] = array[commands[i][0]-1];
                }
            }
        
        
        
        
        
        
        
        return answer;
    }
}