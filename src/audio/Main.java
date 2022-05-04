package audio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Main {
    public static void main (String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        // Yep it works
        Scanner scanner = new Scanner(System.in);
        File file = new File("C:/Users/dallin.reeser779/Downloads/file_example_WAV_1MG.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        clip.start();

        System.out.println("Press enter to stop the audio");
        scanner.nextLine();
        scanner.close();
    }
}
