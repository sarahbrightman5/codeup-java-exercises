package birds;

public class BirdTest {
    public static void main(String[] args) {
        Quaker quaker = new Quaker();
        quaker.setName("Quaker");
        quaker.makeNoise();
        Finch finch = new Finch();
        finch.makeNoise();
    }
}