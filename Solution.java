import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        long k;
        long horizontal, vertical;
        
        for (int i = 0; i < t; i++) {
            k = sc.nextLong();
            
            if (k % 2 == 0) {
                System.out.println(String.valueOf((k / 2) * (k / 2)));
            } else {
                horizontal = k / 2;
                vertical = k - horizontal;
                System.out.println(String.valueOf(horizontal * vertical));
            }
            
        }
    }
}
