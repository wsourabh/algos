package arrays;

import java.util.Arrays;

public class MaxOccuringChar {
         public static char maxOcuuringCharacter(String s){
        	 int count[]=new int[Character.MAX_VALUE];
        	 Arrays.fill(count,0);
        	 char returnVal=' ';
        	 for(int i=0;i<s.length();i++) count[s.charAt(i)]++;
        	 for(int i=0;i<count.length;i++) 
        		 if(count[i] > count[returnVal]) returnVal=(char)i;
        	 return returnVal;
         }
}