package Programmers;
import java.util.*;

public class camouflage {
    public int solution(String[][] clothes) {
        HashMap<String,Integer>map = new HashMap<>();
        for(int i=0;i<clothes.length;i++)
        {
            if(map.containsKey(clothes[i][1]))
                map.replace(clothes[i][1],map.get(clothes[i][1])+1);
            else
               map.put(clothes[i][1],1);    
        }
        int answer = 1;
        for(int value:map.values())
        {
            answer*=(value+1);        
        }
            answer--;
        
        return answer;
    }
}
