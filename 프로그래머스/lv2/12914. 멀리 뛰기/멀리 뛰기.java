import java.util.*;
class Solution {
    public long solution(int n) {
        int []arr = new int [n+1];
        arr[0] = 1;
        arr[1] = 2;
        for(int i=2 ; i<n+1; i++){
            arr[i] = (arr[i-1]+arr[i-2]) % 1234567 ;
        }
        //System.out.println(Arrays.toString(arr));
        return arr[n-1] ;
    }
}