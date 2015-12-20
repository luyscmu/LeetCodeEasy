/**
 * Created by Eason Lu on 8/31/2015.
 */
public class Add {
    public static int input=18;
    public static int addDigits(int num) {
            return 1+(num-1)%9;
    }
    public static void main(String[] args)
    {
        System.out.println(addDigits(input));
//        System.out.println(-1%9);
    }
}
