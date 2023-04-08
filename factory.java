import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.io.*;

// import myArray.benim_iterator;
public class yunus
{
    public static void main(String[] args) {
        long num1;
        long num2;
        long res;   
        Scanner yunus = new Scanner(System.in);
        res = yunus.nextLong();
        num1 =(int) Math.pow(2,0);
        num2=2;
        for(int i =0;;i++)
        {
            if(num1 <res && num2>res)
            {
                System.out.println(2*(res-num1));
                break;
            }
            else if(num1 == res)
            {
                System.out.println(res);
                break;
            }
            num1 *=2 ;
            num2 = num1*2;
        }
    }
}