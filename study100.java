package commit.comp1011.commit100;

import java.io.*;
import java.util.*;


public class study100 {
    // Java Program to Print Common Characters of 2 Strings in Alphabetical Order.

    static final int MaxChar = 26;

    static void printCommon(String str1, String str2) {
        // 2 arrays of length 26 to store occurrence of letters alphabetically for each string

        int[] a1 = new int[MaxChar];
        int[] a2 = new int[MaxChar];

        int l1 = str1.length();
        int l2 = str2.length();

        for (int i = 0; i < l1; i++)
            a1[str1.charAt(i) - 'a'] += 1;

        for (int i = 0; i < l2; i++)
            a2[str2.charAt(i) - 'a'] +=1;

        // If a common index is non-zero it means that the letter corresponding to that index is common to both strings

        for (int i =0; i < MaxChar; i++) {
            if (a1[i] !=0 && a2[i] !=0) {
                //Find the minimum of the occurrence of the character in both strings and print the letter that many number of times

                for(int j =0; j < Math.min(a1[i], a2[i]); j++)
                    System.out.print(((char)(i + 'a')));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String s1 = "thisisatest", s2 = "onceuponatime";
        printCommon(s1, s2);
    }
}
