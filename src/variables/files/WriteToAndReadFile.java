package variables.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToAndReadFile {
    public static void main (String[] args) {
        try {
            FileWriter writer = new FileWriter("src/variables/files/poem.txt");
            // Overrides anything in the file
            writer.write("Roses are red, \nViolets are blue. \nI do not give, \nA crap for you");
            // Adds to the end of the file, doesn't get rid of anything
            writer.append("\n(Grom)");
            writer.close(); // If you don't close the writer it will not write to file.

            PrintFile("src/variables/files/poem.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void PrintFile(String filePath){
        try {
            FileReader reader = new FileReader(filePath);
            int data = reader.read();

            while(data != -1) {
                // Casts data as a character
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("file not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
