/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Substring_Comparison;

import java.util.Scanner;

/**
 *
 * @author Chaity
 */
public class JAVA_STRING_COMPARISAON {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        String a = s;
        int difference = k;
        String[] str = new String[a.length()-difference+1]; 
        int i,j;
        for(i=0;i<=(a.length()-difference);i++)
        {
                str[i] = a.substring(i, i+difference);
            
        }
        int count=0;
        for(i=0;i<str.length;i++)
        {
            if(str[i]==null)
            {
              count++;
            }           
        }
        
        String[] new_str = new String[str.length-count];
         for(i=0;i<new_str.length;i++)
        {
            new_str[i] = str[i];
            //System.out.println(new_str[i]);
        }
        
        String temp;
        for ( i = 0; i < new_str.length-1; i++) {
            for ( j = i + 1; j < new_str.length; j++) {
                if (new_str[i].compareTo(new_str[j]) > 0) {
                    temp = new_str[i];
                    new_str[i] = new_str[j];
                    new_str[j] = temp;
        }
      }
     }

    
        smallest = new_str[0];
        largest =  new_str[new_str.length-1];
       
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
