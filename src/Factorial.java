import java.util.Map;

/**
 * Created by Eason Lu on 8/31/2015.
 */
public class Factorial {
    public static int input=10;
    public static int trailingZeroes(int n) {
        int count=0;
        while(n>=5)
        {
            count+=(int)(n/5);
            n=(int)(n/5);
        }
        return count;
    }
    public static void main(String[] args)
    {
        System.out.print(trailingZeroes(input));
    }
}
