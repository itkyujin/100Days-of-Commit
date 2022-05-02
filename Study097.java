package ca.georgiancollege.copr.comp1011.commit097;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;

public class Study097 {
    public static void main(String[] args) throws Exception {
        Charset cs = Charset.defaultCharset();
        Path p = new File("C:\\Temp\\new001.txt").toPath();

        if(Files.notExists(p))
            Files.createFile(p);

        byte[] data = "Good Morning! \n Good Bye!\n".getBytes();
        Files.write(p, data, StandardOpenOption.APPEND);

        try{
          List<String> lines = Files.readAllLines(p, cs);

          for (String line : lines)
            System.out.println(line);

        } catch (IOException e) {

        }
    }
}
