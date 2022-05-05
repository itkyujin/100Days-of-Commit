package commit.comp1011.commit095;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Commit095 {

    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder(5);
        builder.append(2);
        builder.append(3.14);
        builder.append('A');
        System.out.println(builder.capacity());
        System.out.println(builder.length());
        System.out.println(builder.toString());

        builder.append("Java is a programming Language!");
        System.out.println(builder.capacity());
        System.out.println(builder.length());
        System.out.println(builder.toString());

        builder.replace(3, 4, "A");
        System.out.println(builder.capacity());
        System.out.println(builder.length());
        System.out.println(builder.toString());

        System.out.println("Enter the name of the File: ");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        String directoryName = sc.nextLine();

        File f = new File(fileName);
        File d = new File(directoryName);
        if (f.exists())
            System.out.println("File Exists");
        else
            System.out.println("File does not Exist");
        if (d.exists())
            System.out.println("Directory Exists");
        else
            System.out.println("Directory does not Exists");

        File createFile = new File(fileName);
        if (createFile.createNewFile()){
            System.out.println("File is created!");
        } else{
            File rename = new File(fileName + "(1).txt");
            f.renameTo(rename);
        }

        File createDir = new File(directoryName);
        if (!createDir.exists()){
            createDir.mkdir();
        } else{
            System.err.println("Directory already exists!");
        }
    }
}
