package vehicle;

public class Vehicle {
    private String instace;

    public String getInstace() {
        return instace;
    }

    public void setInstace(String instace) {
        this.instace = instace;
    }
    public void makeNoise(){
        System.out.println("vroom vroom");
    }
    public void alarmCascade(){
        System.out.println("AHAHAHAHAH");
    }

}
