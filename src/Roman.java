/**
 * Created by Eason Lu on 9/8/2015.
 */
public class Roman {
    public static int input = 18;

    public static int romanToInt(String s) {
        int output = 0;
        int temptOuput=0;
        char[] romanArr = s.toCharArray();
        for (int i = 0; i < romanArr.length; i++) {
            if(romanArr[i] == 'I'&&i < romanArr.length-1&&(romanArr[i + 1] == 'V'||romanArr[i + 1] == 'X'))
            {
                temptOuput+=output;
                if (romanArr[i + 1] == 'V') {
                    temptOuput += 4;
                    output=0;
                    i+=1;
                }else if(romanArr[i + 1] == 'X')
                {
                    temptOuput += 9;
                    output=0;
                    i+=1;
                }
            }
            else if (romanArr[i] == 'I') {
                output += 1;
            } else if (romanArr[i] == 'V') {
                output += 5;
            }else if(romanArr[i] == 'X'&&i<romanArr.length-2&&romanArr[i+2]=='X'&&romanArr[i+1]!='X')
            {
                output+=10;
                temptOuput+=output;
                output=0;
            }
            else if (romanArr[i] == 'X'&&i < romanArr.length-1&&(romanArr[i + 1] == 'L'||romanArr[i + 1] == 'C')) {
                    if (romanArr[i + 1] == 'L') {
                        temptOuput += 40;
                        if(output!=0)
                        {
                            temptOuput+=output;
                        }
                        output=0;
                        i+=1;
                    }else if(romanArr[i + 1] == 'C')
                    {
                        temptOuput +=90;
                        if(output!=0)
                        {
                            temptOuput+=output;
                        }
                        output=0;
                        i+=1;
                    }
            }else if (romanArr[i] == 'X') {
                output += 10;
            }else if (romanArr[i] == 'L') {
                output += 50;
            }else if(romanArr[i] == 'C'&&i<romanArr.length-2&&romanArr[i+2]=='C'&&romanArr[i+1]!='C')
            {
                output+=100;
                temptOuput+=output;
                output=0;
            } else if (romanArr[i] == 'C'&&i < romanArr.length-1&&(romanArr[i + 1] == 'D'||romanArr[i + 1] == 'M')) {
                    if (romanArr[i + 1] == 'D') {
                        temptOuput += 400;
                        if(output!=0)
                        {
                            temptOuput+=output;
                        }
                        output=0;
                        i+=1;
                    }else if(romanArr[i + 1] == 'M')
                    {
                        temptOuput += 900;
                        if(output!=0)
                        {
                            temptOuput+=output;
                        }
                        output=0;
                        i+=1;
                    }
            } else if (romanArr[i] == 'C') {
                output += 100;
            }else if (romanArr[i] == 'D') {
                output += 500;
            } else if(romanArr[i] == 'M'&&i<romanArr.length-2&&romanArr[i+2]=='M'&&romanArr[i+1]!='M')
            {
                output+=1000;
                temptOuput+=output;
                output=0;
            }else if (romanArr[i] == 'M') {
                output += 1000;
            }
        }
        return output+temptOuput;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MDCCCLXXXIV"));
    }
}
