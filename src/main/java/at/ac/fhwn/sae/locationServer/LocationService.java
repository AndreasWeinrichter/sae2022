package at.ac.fhwn.sae.locationServer;

import at.ac.fhwn.sae.Lesson4.SaePoint;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

@Service
public class LocationService {

    static Hashtable<Integer, List<SaePoint>> locations = new Hashtable<>();

//1
    public void addLocation(int id, SaePoint location) {
       if(locations.containsKey(id)) {
           locations.get(id).add(location);
       }else{
           locations.put(id, new ArrayList<>());
           locations.get(id).add(location);
       }
    }
    //2 & 3
    public static SaePoint getLocation(int id, Integer index){
        if (index == null){
            return locations.get(id).get(locations.get(id).size()-1);

        }else
        return locations.get(id).get(index);
    }
//4
    public static List<SaePoint> getLocations(int id){

        return locations.get(id);
    }

//5
    public static Hashtable<Integer, List<SaePoint>> getAllLocations() {
        return locations;
    }

}
