package at.ac.fhwn.sae.AnimalFarm;

public class Pig extends Animal{
    private static final String CLASS_DESCRIPTION = "This is a pig class";
    private static final String DEFAULT_COW_NAME = "default pig name";

    private static final String DEFAULT_ID = "0";

    private static int count = 0;
    private String id;


    //    public Cow(){
//        this.name = DEFAULT_COW_NAME;
//        this.id = "C" + ++count;
//    }
    int width = 3;
    public Pig(String name){
        this.name = name;
        this.id = "K" + String.format("%0" + width + "d", Integer.valueOf(++count));
    }

    @Override
    public String getID() {
        return id;
    }

    public static int getCount(){
        return count;
    }
}
