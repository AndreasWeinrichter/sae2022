package at.ac.fhwn.sae.locationServer;

import at.ac.fhwn.sae.Lesson4.SaePoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Hashtable;
import java.util.List;

@RestController
public class LocationController {

    Logger logger = LoggerFactory.getLogger(this.getClass());



    LocationService locationService;

    public LocationController(LocationService locationService){
        this.locationService = locationService;
    }
//1
    @GetMapping("/setLocation")
    public SaePoint setLocation(
            @RequestParam("id") int id,
            @RequestParam("time") String time,
            @RequestParam("lat")double lat,
            @RequestParam("lon")double lon,
            @RequestParam("satNr")int satNr,
            @RequestParam("fixQ")int fixQ
    ) {
      SaePoint saePoint = new SaePoint(time, lat, lon, satNr, fixQ);
      System.out.println(time);
      //System.out.println(saePoint.getTime());
        locationService.addLocation(id, saePoint);

        logger.info("Point received: "+ lat + ";"+ lon);
         return saePoint;
    }
    //2 & 3
    @GetMapping("/location")
    public SaePoint getLocation(
            @RequestParam("id") int id,
            @RequestParam(value= "index", required = false)Integer index
    ){
        return LocationService.getLocation(id, index);
    }
    //4
    @GetMapping("/locations")
    public List<SaePoint> getLocations(
            @RequestParam("id") int id
    ){
        return LocationService.getLocations(id);
    }
//5
    @GetMapping("/allLocations")
    public Hashtable<Integer, List<SaePoint>> points(){
        return LocationService.getAllLocations();
    }
}
