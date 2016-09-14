/**
 * Created by Becky on 2016/9/6.
 */
import static java.lang.Math.*;
import java.util.*;
public class Hello {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("How many nums do you need to draw?");
        int k=in.nextInt();
        System.out.println("what is the highest num you can draw?");
        int n = in.nextInt();
        int[] numbers=new int[n];
        for (int i=0;i<numbers.length;i++){
            numbers[i]=i+1;
        }
        int[] result=new int[k];
        for(int i=0;i<result.length;i++){
            int r=(int)(Math.random()*n);
            result[i]=numbers[r];
            numbers[r]=numbers[n-1];
            n--;
        }
        Arrays.sort(result);
        System.out.println("bet the following combination.it'll make you rich!");
        for (int r:result)
            System.out.println(r);
    }


    }
