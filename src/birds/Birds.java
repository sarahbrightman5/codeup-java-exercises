
package birds;

public class Birds{

    private String name;
    public Birds(){ }

    public Birds(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Tweet tweet");
    }

    public void layEggs(){
        System.out.println("Laying an egg.");
    }
}
