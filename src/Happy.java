/**
 * Created by Eason Lu on 8/31/2015.
 */
public class Happy {
    public static int countHappy(int num)
    {
        char[] numArr ;
        int length=0;
        int newNum;
        while(length!=1)
        {
            newNum=0;
            numArr=String.valueOf(num).toCharArray();
            length = numArr.length;
            for(int i=0;i<length;i++)
            {
                newNum+= Math.pow(Integer.valueOf(String.valueOf(numArr[i])),2);
            }
            num=newNum;
        }
        return 0;
    }
//    public static boolean isHappy(int n) {
//
//    }
//    public static void main(Strings[] args)
//    {
//
//    }
}
