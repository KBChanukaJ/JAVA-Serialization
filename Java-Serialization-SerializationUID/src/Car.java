import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car extends Vehicle implements Externalizable {
    private static  long SerialVersionUID = 59L;

    private double speed;
    private transient int gear;

    public Car(){

    }

    public Car(String colour, double speed) {
        super(colour);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(getColour());
        out.writeInt(getGear());
        out.writeDouble(getSpeed());

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        setColour((String) in.readObject());
        setSpeed(in.readDouble());
        setGear(in.readInt());

    }

    @Override
    public String toString() {
        return "Car{" +
                "Colour= " + getColour() + " " +
                "speed= " + speed +
                " gear= " + gear +
                '}';
    }
}
