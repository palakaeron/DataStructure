import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextInt();
        for(long a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            long result = 0;
            result= sum(n,3)+ sum(n,5)- sum(n,15);
            System.out.println(result); 
        } 
    }
  public static long sum(long n, long k){
    long m =0;
    m= (n-1)/k; //number of terms divisible by k
    long sum = 0;
    sum= (k * m *(m+1))/2; //3 or 5 into natural no. formula
    return sum; 
  }
}
