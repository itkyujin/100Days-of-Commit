package commit.comp1011.commit095;

import java.util.Scanner;

public class Study096 {

        public static void main(String[] args) {
           // fileReverseWithoutUsingStringMethods();
            FinalReverseWithoutUsingInbuiltFunction();

        }

    // Q #1) Write a Java Program to reverse a string without using String inbuilt function.
        static void fileReverseWithoutUsingStringMethods() {
            String str = "Automation";
            StringBuilder str2 = new StringBuilder();
            str2.append(str);
            str2 = str2.reverse();     // used string builder to reverse
            System.out.println(str2);
    }

    // Q #2) Write a Java Program to reverse a string without using String inbuilt function reverse().
        static void FinalReverseWithoutUsingInbuiltFunction() {
            String str;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter your String");
            str = in.nextLine();
            String[] token = str.split("");    //used split method to print in reverse order
            for(int i=token.length-1; i&gt;=0; i--)
            {
                System.out.print(token[i] + "");
            }

        }
}
