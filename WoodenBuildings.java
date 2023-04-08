//Brace your keyboard
//inzva community built algoleague for every algorithm enthusiast hungry for self-improvement and friendly competition. Have fun and good luck!

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main (String[] args) {
    Scanner yunus = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        num1= yunus.nextInt();
        num2 = yunus.nextInt();
        num3 = yunus.nextInt();
        long result =0;
        int bir =-999;
        int iki = -999;
        int uc = -999;
        ArrayList<Integer> A = new ArrayList<>(num1);
        ArrayList<Integer> B = new ArrayList<>(num2);
        ArrayList<Integer> C = new ArrayList<>(num3);
        for(int i =0;i<num1;i++)
        {
            A.add(yunus.nextInt());
        }
        for(int i =0;i<num2;i++)
        {
            B.add(yunus.nextInt());
        }
        for(int i =0;i<num3;i++)
        {
            C.add(yunus.nextInt());
        }
        Collections.sort(A);
        Collections.sort(B);
        Collections.sort(C);
        num1--;
        num2--;
        num3--;
        int count=0;
        while(count <=1)
        {
            if(num1>=0)
                bir = A.get(num1);
            else
                bir =-999;
            if(num2 >=0)
                iki = B.get(num2);
            else
                iki =-999;
            if(num3 >=0)
            uc = C.get(num3);
            else
                uc = -999;
            if(bir >= uc && iki >= uc&& num1 >=0 && num2 >=0)
            {
                result += (bir*iki);
               // System.out.println(bir+"  "+iki);
                num1--;
                num2--;
            }
            else if(iki >= bir && uc >= bir && num2 >=0 && num3 >=0)
            {
                result += (uc*iki);
                //System.out.println(uc+"  "+iki);
                num3--;
                num2--;
            }
            else if(uc >= iki && bir >= iki && num3>=0 && num1 >=0)
            {
                result += (uc*bir);
                //System.out.println(bir+"  "+uc);
                num3--;
                num1--;
            }
            if(num1 == -1 || num2==-1||num3==-1)
            {
                if(num1 ==-1)
                    num1=-4;
                else if(num2 ==-1)
                        num2=-4;
                else if (num3 == -1)
                    num3=-4;
                count++;
            }

        }
        System.out.println(result);


    }
}