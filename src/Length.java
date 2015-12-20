/**
 * Created by Eason Lu on 8/28/2015.
 */
public class Length {
    public static String input="a ";
    public static int lengthOfLastWord(String s) {
        if(s.length()==0)
        {
            return 0;
        }
        else
        {
            String[] word = s.split(" ");
            if(word.length==0)
            {return 0;}
            else
            {return word[word.length-1].length();}
        }
    }
    public static void  main(String[] args)
    {
        System.out.println(lengthOfLastWord(input));
    }
}
