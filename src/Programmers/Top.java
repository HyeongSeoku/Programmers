package Programmers;
import java.awt.Point;
import java.util.Stack;

public class Top
	{
    public int[] solution(int[] heights) {
         int[] answer = new int[heights.length];

        Stack<Point> st = new Stack<Point>();

        for(int i=heights.length-1; i>=0; i--) {
            for(int j=i-1; j>=0; j--) {
                if(heights[i] < heights[j]) {
                    st.push(new Point(i+1, j+1));
                    break;
                } else if(j==0) {
                    st.push(new Point(i+1, 0));
                }
            }
        }

        int size = st.size();
        answer[0] = 0;
        for(int i=1; i<=size; i++) {
            answer[i] = st.pop().y;
        }

        return answer;
    }
}