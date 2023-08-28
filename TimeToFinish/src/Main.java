import java.util.*;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        TimeToFinish ttf = new TimeToFinish();
        ttf .setEstimate(5000);
// a questo punto un altro thread invoca ttf .setEstimate(3000)
        Thread.sleep(500);
        System.out.println("Tempo␣rimanente:␣" + ttf.maxTimeToFinish() + "␣millisecondi.");
        System.out.println( ttf ) ;
    }
}