/**
 * Created by Eason Lu on 8/27/2015.
 */
public class Excel {
    public static String input = "AAA";

    public static int titleToNumber(String s) {
        int count =0;
        for (int i=1;i<=s.length();i++)
        {
            count+=((s.charAt(i-1))-64)*Math.pow(26,s.length()-i);
        }
        return count;
//        if(s.length()==1)
//        {
//            System.out.println(s.charAt(0));
//            return (s.charAt(0))-64;
//        }
//        else
//        {
//            return (s.charAt(0)-64)*26+(s.charAt(1))-64;
//        }
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber(input));
    }
}
