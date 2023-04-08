import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.io.*;

// import myArray.benim_iterator;
public class yunus
{
    public static void main(String[] args) {
        int firstNum;
        int secondNum =0;
        Scanner yunus = new Scanner(System.in);
        ArrayList<Integer> test = new ArrayList<>(50);
        ArrayList<Integer> output = new ArrayList<>(50);
        ArrayList<Integer> place = new ArrayList<>(50);  
        firstNum= yunus.nextInt();
        for(int i =0;i<firstNum;i++)
        {
            secondNum = secondNum + yunus.nextInt();
            test.add(secondNum);
            output.add(secondNum);
        }
        
        firstNum = yunus.nextInt();
        for(int i=0;i<firstNum;i++)
        {
            secondNum = yunus.nextInt();
            binarySearch(output, secondNum, place);
        }


        System.out.println("Output =>");
        Iterator gez = output.iterator();
        while(gez.hasNext())
            System.out.print("--"+gez.next());
    }
    public static void binarySearch(ArrayList<Integer> input,int key,ArrayList<Integer> output){  
        int first =0;
        int last = input.size();
        int mid = (first + last)/2;  
        while( first <= last ){  
            System.out.println(mid);
           if ( input.get(mid) < key ){  
             first = mid + 1; 
           } else if ( mid>0 &&input.get(mid)> key && input.get(mid-1)<key)
           {
                mid += 1;
                System.out.println("Element is found at index: " + mid); 
                break;
           }
           else if ( mid==0 &&input.get(mid)> key)
           {
                mid += 1;
                System.out.println("Element is found at index: " + mid); 
                break;
           }
           else if ( input.get(mid) == key ){  
            mid +=1;
             System.out.println("Element is found at index: " + mid);  
             break;  
           }else{  
              last = mid - 1;  
           }  
           mid = (first + last)/2;  
        }  
         
      } 
}