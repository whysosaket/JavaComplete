import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AudioPlayer {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner sc = new Scanner(System.in);

        //code
        File file = new File("insane.wav");
        AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);

        //we use clip method to play the program

        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        //when we start this code this file runs in a background thread and then it terminates immediately
        //thus we somehow need to run this
        System.out.println("P = Play, S= Stop, R= Reset, F=Forward, B=Backward, Q=Quit");
        String resp="";
        while(!resp.equals("Q")){
            resp=sc.next().toUpperCase();
            switch (resp){
                case("P")-> clip.start();
                case("S")-> clip.stop();
                case("R")-> clip.setMicrosecondPosition(0);
                case("F")->clip.setMicrosecondPosition(clip.getMicrosecondPosition()+5000000);
                case("B")->clip.setMicrosecondPosition(clip.getMicrosecondPosition()-5000000);
                case("Q")->clip.close();
                default -> System.out.println("Not Valid Response!!!");
            }
        }
    }
}
