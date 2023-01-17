package at.ac.fhwn.sae.locationClient;


import at.ac.fhwn.sae.Lesson4.NmeaReaderApplication;
import at.ac.fhwn.sae.Lesson4.SaePoint;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class LocationTransmitter {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File(SaePoint.class.getClassLoader().getResource("auto.txt").getFile());
        NmeaReaderApplication nmeaReader = new NmeaReaderApplication(file);
        LocationClientService locationClientService = new LocationClientService();

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {

                try {
                    SaePoint saePoint = nmeaReader.fileReader();

                    System.out.println("Time " + new Date());
                    locationClientService.sendLocation(1, saePoint);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

            }
        };

        Timer timer = new Timer("timerTask");
        timer.scheduleAtFixedRate(timerTask, 1000, 1000);

    }
}