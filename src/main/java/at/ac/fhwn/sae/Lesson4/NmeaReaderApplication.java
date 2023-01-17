package at.ac.fhwn.sae.Lesson4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class NmeaReaderApplication {

    private FileInputStream fis;// = new FileInputStream(file);
    private Scanner scanner;// = new Scanner(fis);

    public NmeaReaderApplication(File file) throws FileNotFoundException {
        fis = new FileInputStream(file);
        scanner = new Scanner(fis);
        //initScanner();
    }


    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(Objects.requireNonNull(NmeaReaderApplication.class.getClassLoader().getResource("auto.txt")).getFile());
        // System.out.println("Exists: " + file.exists());
        // System.out.println("Can read: " + file.canRead());

        ArrayList<SaePoint> NmeaList = new ArrayList<>();

        //fileReader(file, NmeaList);
        System.out.println(String.format("%-10s| %-15s| %-15s| %-5s | %-4s", "time","latitude","longitude","NrOfSat","fix"));
        for(SaePoint element : NmeaList){
            System.out.println(String.format("%-8s | %-14s | %-14s | %-7s | %-4s", element.getTime(), element.getLatitude(),  element.getLongitude(), element.getNumberOfSatelites(), element.getFix()));

        }
    }

    public SaePoint fileReader() throws FileNotFoundException {
        double latitude = 0;
        double longitude = 0;
        double latitudeMinute;
        double latitudeDegree;
        double longitudeDegree;
        double longitudeMinute;
        //FileInputStream fis = new FileInputStream(file);
        //Scanner scanner = new Scanner(fis);

        while (scanner.hasNext()){
            String[] components = scanner.nextLine().split(",");

            if (components[0].equals("$GNGGA")){
                latitudeDegree = Double.parseDouble(components[2].substring(0,2));
                latitudeMinute = Double.parseDouble(components[2].substring(2))/60;
                latitude = latitudeDegree + latitudeMinute;
            if (components[0].equals("S")){
                latitude= latitude * -1;
            }
            longitudeDegree = Double.parseDouble(components[4].substring(0, 3));
            longitudeMinute = Double.parseDouble(components[4].substring(3)) / 60;
                longitude = longitudeDegree + longitudeMinute;
                if (components[5].equals("W")) {
                    longitude = longitude * -1;
                }
                
                //NmeaList.add(new SaePoint(components[1], (float) latitude, (float) longitude,components[7],components[6]));
                //System.out.println(latitude);
                return (new SaePoint(components[1], (float)latitude, (float) longitude,components[7],components[6]));
         }

        }
        return null;
    }


}
