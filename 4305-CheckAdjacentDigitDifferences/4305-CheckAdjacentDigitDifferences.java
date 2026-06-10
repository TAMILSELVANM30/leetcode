// Last updated: 6/11/2026, 1:30:07 AM
import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {  
                int d;
                List<Integer>name=s.chars()
                    .map(Character::getNumericValue)
                    .boxed()
                    .collect(Collectors.toList());
        int le =name.size();
      for (int i=0;i<le-1;i++){
          d=Math.abs(name.get(i+1)-name.get(i));    
        
        if ( d>2){
            return false;
        }
        }
         return true;   
        
    }
}