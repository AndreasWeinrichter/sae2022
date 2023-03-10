package at.ac.fhwn.sae.locationServer;

import at.ac.fhwn.sae.AnimalFarm.Cow;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Hashtable;

@RestController
public class HelloWorldController {

    CowService cowService;

    public HelloWorldController(CowService cowService){
        this.cowService = cowService;
    }

    @GetMapping("/")
    public String root(){
        return "Hello World";

    }
    @GetMapping("/cow")
    public Cow cow(
            @RequestParam("index")int index){
        Cow cow = new Cow("loisi");
        cowService.helloWorld(cow, index);
        return cow;
    }
    @GetMapping("/cows")
    public Hashtable<Integer, Cow> cows(){
        return cowService.getCows();
    }


}
