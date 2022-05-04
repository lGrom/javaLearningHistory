package variables.files;

import java.io.File;

public class FileMain {
    public static void main (String[] args){

        // If you want somewhere else on your computer, you can just use the full directory
        File file = new File("src/variables/files/textfile.txt");

        if(file.exists()) {
            System.out.println("The file exists");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getPath());
            //file.delete(); deletes the file
        } else {
            System.out.println("That file doesnt exist");
        }
    }
}
