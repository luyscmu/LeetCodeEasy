/**
 * Created by Eason Lu on 8/28/2015.
 */
public class Ugly {
    public static int input=0;
    public static int UglyNum(int num) {
        if(num==0)
        {
            return 0;
        }
        else if(num%2==0)
        {
            return UglyNum(num/2);
        }
        else if(num%3==0)
        {
            return UglyNum(num/3);
        }
        else if(num%5==0)
        {
            return UglyNum(num/5);
        }
        else if(num==1)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static boolean isUgly(int num) {
        if (UglyNum(num)==1) {
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isUgly(input));
    }
}
