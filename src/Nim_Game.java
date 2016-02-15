/**
 * Created by Eason Lu on 1/17/2016.
 */
public class Nim_Game {
    public static void main()
    {
        canWinNim(10);
    }
    public static boolean canWinNim(int n) {
        if(n % 4==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
