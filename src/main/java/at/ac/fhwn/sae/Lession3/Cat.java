package at.ac.fhwn.sae.Lession3;

public class Cat extends Animal{
    private static final String DEFAULT_CAT_NAME = "No name cat";


    public Cat(){
        this.name = DEFAULT_CAT_NAME;
    }
    @Override
    public String getID(){
        return DEFAULT_ID;
    }
}
