package at.ac.fhwn.sae.AnimalFarm;

public abstract class Animal {
    public String name;
    protected String number;


    protected static final String DEFAULT_ID="0";
    protected static final Integer DEFAULT_NUMBER = 0;

    public abstract String getID();

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
