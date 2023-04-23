public class AbstractInterfacesLecture {
    public static void main(String[] args) {
        Developer newguy = new Developer("sarah","developer");
        System.out.println(newguy.work());
        Bear bigBear = new Bear("Yoggie","grizzly",1200,true);
        System.out.println(bigBear.skin());
    }
}
abstract class  Employee{
    protected String name;
    protected String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public abstract String work();
}
class Developer extends Employee{
    public Developer(String name, String department) {
        super(name, department);
    }
    public String work(){
        return "writing code..";
    };
}
abstract class Notification{
    public abstract boolean didOptIn();
    public abstract String unsubscribeLink();
    public abstract String getPhysicalAddress();
    public abstract String getsenderINfo();


}
abstract class Anamal{
    protected String name;
    protected String species;
    protected double weight;
    protected boolean isLegendary;

    public Anamal(String name, String species, double weight, boolean isLegendary) {
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.isLegendary = isLegendary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isLegendary() {
        return isLegendary;
    }

    public void setLegendary(boolean legendary) {
        isLegendary = legendary;
    }
}
class Bear extends Anamal implements Skinnacle{
    public Bear(String name, String species, double weight, boolean isLegendary) {
        super(name, species, weight, isLegendary);
    }
    public String skin() {
        if(this.isLegendary){
            return "Legendary bear hide";
        }
        return "Bear Hide";
    }
}
abstract class List{
    protected String name;
    protected String[] items;
    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public List(String name, String[] items) {
        this.name = name;
        this.items = items;
    }
    public void addItem(String item){

    }
}
