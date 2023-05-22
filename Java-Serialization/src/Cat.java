public class Cat extends Animal{
     private String colour;

    public Cat(double speed, String colour) {
        super(speed);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "speed='" + getSpeed() +
                "colour='" + colour + '\'' +
                '}';
    }
}
