/**
 * avg
 */
public class avg {

    public double solution(int[] arr) {
        double answer = 0.0;
        for(int var:arr)
        {
            answer += var;
        }
        return answer/arr.length;
    }
}
