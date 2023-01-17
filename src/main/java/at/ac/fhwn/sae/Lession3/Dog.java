package at.ac.fhwn.sae.Lession3;

public class Dog extends Animal{

    private static final String CLASS_DESCRIPTION = "This is a dog class";
    private static final String DEFAULT_DOG_NAME = "Dog with no name";

    private static int count = 0;
    private String id;

    public Dog(){
        this.name = DEFAULT_DOG_NAME;
        this.id = "0" + getCount();
    }

    public Dog(String name){
        this.name = name;
        this.id = "0" + getCount();
    }

    public void bark(){
        System.out.println("Wuff");
    }

    @Override
    public String getID() {
        return id;
    }

    public static int getCount(){
        return count;
    }
}