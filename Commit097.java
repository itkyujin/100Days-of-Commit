package ca.georgiancollege.copr.comp1011.commit097;
import javax.naming.Context;
import javax.swing.text.View;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Commit097 {

    // Declare a name of the file that your App will read file
    String appFilename = "myappdata";

    public void onClickReadContent(View v){

        try {
            readFileContents();
        }
        catch (IOException e){
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    public void onClickSaveContent(View v){

        EditText content = findViewById(R.id.editTextTextMultiLineWriteContent);
        try{
            writeFileContent(content.getText().toString());
        }
        catch (IOException e){
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    public void readFileContents() throws IOException {

        // Locate the Multiline Android element to write to
        EditText target = findViewById(R.id.editTextTextMultiLineReadContent);

        // Open up the App file
        // List<String> content = Files.readAllLines(Paths.get(appFilename));
        FileInputStream fis = openFileInput(appFilename);

        Scanner scanner = new Scanner(fis);

        StringBuilder sb = new StringBuilder();
        // for(String line : content){
        //    sb.append(line);
        // }

        while (scanner.hasNext()){
            sb.append(scanner.nextLine() + '\n');
        }

        // Write Data to the Android element
        target.setText(sb.toString());
    }

    public void writeFileContent(String content) throws IOException {
        // Get App Context openFileOutput method
        // Append mode

        FileOutputStream fos = getApplicationContext().openFileOutput(appFilename, Context.MODE_APPEND);
        fos.write(content.getBytes());

    }
}
