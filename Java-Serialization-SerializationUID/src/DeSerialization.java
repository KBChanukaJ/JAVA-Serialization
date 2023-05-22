import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialization {
    FileInputStream fis;
    ObjectInputStream ois;

    public void carDeSerialize(){
        try {
            fis = new FileInputStream("G:\\SerFile\\Car.ser");
            ois = new ObjectInputStream(fis);
            Car car =(Car) ois.readObject();
            System.out.println("Output is : "+car.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
