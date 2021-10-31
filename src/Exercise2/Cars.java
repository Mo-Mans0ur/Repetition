package Exercise2;

public class Cars {
    private String name;
    private int velocity;
    private int seats;
    private String color;


    public Cars(String name, int velocity, int seats, String color) {
        this.name = name;
        this.velocity = velocity;
        this.seats = seats;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", velocity=" + velocity +
                ", seats=" + seats +
                ", color='" + color + '\'' +
                '}';
    }
}
