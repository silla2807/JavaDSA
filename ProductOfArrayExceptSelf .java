import java.io.*;
import java.util.*;
public class Main {
   public static void main(String[] args) {
       int[] nums = {2,3,1,-4};
      int[] result = new int[nums.length];
        int product=1;
        
        for(int i=0;i<nums.length;i++)
        {
            product =1;
            for(int j=0;j<nums.length;j++)
            {
                if(j!=i )
                {
                     System.out.print(nums[j]+" ");
                     product = product * nums[j];
                   
                }
            }
            result[i]=product;
            System.out.print(result[i]);
            
        }
        int max = Arrays.stream(result).max().getAsInt();
        System.out.print(max);
    }
}
