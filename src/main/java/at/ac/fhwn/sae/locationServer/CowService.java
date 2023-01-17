package at.ac.fhwn.sae.locationServer;

import at.ac.fhwn.sae.AnimalFarm.Cow;
import at.ac.fhwn.sae.Lesson4.SaePoint;
import org.springframework.stereotype.Service;

import java.util.Hashtable;

@Service
public class CowService {

    Hashtable<Integer, Cow>  cows = new Hashtable<>();


    public void helloWorld(Cow cow, int index){
        System.out.println("Hello World");
        cows.put(index, cow);
    }

    public Hashtable<Integer, Cow> getCows() {
        return cows;
    }


}
