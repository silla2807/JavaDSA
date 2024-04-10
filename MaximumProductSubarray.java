import java.io.*;
import java.util.*;
public class Main {
   public static void main(String[] args) {
      ArrayList<Integer> sums = new ArrayList<>();
      int sum=1;
      int arr[] = {-2,1,2,3};
      System.out.println("The subarrays are-");
      
      for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
       sum=1;
        
         for (int k = i; k <=j; k++){
              System.out.print(arr[k]+" ");
              sum= sum*arr[k];
         }
         System.out.println(" ");
         sums.add(sum);    
      }
      }
   for(int l=0;l<sums.size();l++) {
         System.out.print(sums.get(l)+" ");
   }
  System.out.println(" ");
     int max = sums.get(0);

  
        for (int o = 1; o < sums.size();o++){
            max = Math.max(max, sums.get(o)); 
        }

        System.out.print("Maximum value in the array: " + max);
    
        
  
}
}
