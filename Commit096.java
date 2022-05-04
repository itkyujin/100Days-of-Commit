package ca.georgiancollege.copr.comp1011.commit096;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class Commit096 {
    public static void main(String[] args) {

        // task2();
        // fileManipulation2();
        // fileManipulation3();
         fileManipulation4();
    }

    static void fileManipulation2(){

        for(File current : Path.of("./").toFile().listFiles()){

            System.out.println("File name: " + current.getName());
            System.out.println("Is Dir? " + current.isDirectory());
            System.out.println("Is File? " + current.isFile());
        }
    }

    static void fileManipulation3(){

        Path path = Paths.get("first.txt");

        StringBuilder sb = new StringBuilder("Hello Everyone!!!\n");
        try {
            // Files.write(path, sb.toString().getBytes(), StandardOpenOption.APPEND);
            Files.writeString(path, sb.toString(), StandardOpenOption.APPEND);
        }
        catch (IOException e){
            System.err.println(e);
        }
    }

    static void fileManipulation4(){

        Path path = Paths.get("first.txt");

        try {
            /*

            List<String> content = Files.readAllLines(path);
                for(String line : content){
                    System.out.println(line);
                }
             */

            StringBuilder content = new StringBuilder(Files.readString(path));
            System.out.println(content);
        }
        catch (IOException e){
            System.err.println(e);
        }

    }

    static void task2(){

        Scanner input = new Scanner(System.in);

        Path filePath;
        Path dirPath;
        Path root = Paths.get("src", "ca", "georgiancollege",
                "copr", "comp1011", "commit096", "task2");


        System.out.println("Please enter file name without extension");

        // String fileName = input.nextLine();
        StringBuilder fileName = new StringBuilder(input.nextLine());
        System.out.println("Please enter directory name");
        String dirName = input.nextLine();

        // Ensure that Our root Path exists

            try {
                Files.createDirectory(root);
            }
            catch (IOException e) {
                // System.err.println(e);
                System.err.println("The root directory already exists!!!");
            }

        if(!fileName.toString().contains(".txt")){
            // fileName += ".txt";
            fileName.append(".txt");
        }

        filePath = Paths.get(
                root.toAbsolutePath().toString()
                +
                        File.separator
                +
                        fileName.toString()

        );
        // System.out.println(filePath.toAbsolutePath());

        System.out.println("Dose the file exists? " + Files.exists(filePath));

        File userFile = filePath.toFile();
        if(userFile.exists()){
            System.out.println("File already exists, we are renaming it. ");

            fileName.insert(fileName.length() -4, "(1)");

            filePath = Paths.get(
                    root.toAbsolutePath().toString()
                            +
                            File.separator
                            +
                            fileName.toString()

            );
            try {
                filePath.toFile().createNewFile();
            }
            catch (IOException e){
                System.err.println(e);
            }



        }

        }
    }
