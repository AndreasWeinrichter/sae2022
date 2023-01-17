package at.ac.fhwn.sae.Lesson4;

public class SaePoint{
    public String time;
    public double latitude;
    public double longitude;
    public String numberOfSatelites;
    public String fix;

    public SaePoint(String time, double latitude, double longitude, String numberOfSatelites, String fix){
        this.time = time;
        this.latitude = latitude;
        this.longitude = longitude;
        this.numberOfSatelites = String.valueOf(numberOfSatelites);
        this.fix = String.valueOf(fix);

    }

    public SaePoint(String time, double lat, double lon, int sat, int fix) {
        this.time = time;
        this.latitude = lat;
        this.longitude = lon;
        this.numberOfSatelites = String.valueOf(sat);
        this.fix = String.valueOf(fix);

    }

    public String getTime(){
        return time;
    }
    public double getLatitude(){
        return latitude;
    }
    public double getLongitude(){
        return longitude;
    }
    public String getNumberOfSatelites(){
        return String.valueOf(numberOfSatelites);
    }
    public String getFix(){
        return String.valueOf(fix);
    }

}
