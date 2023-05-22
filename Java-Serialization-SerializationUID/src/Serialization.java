import com.sun.jdi.ObjectReference;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
    FileOutputStream fos;
    ObjectOutputStream ous;

    public void carSerialize(Car c){
        try {
            fos = new FileOutputStream("G:\\SerFile\\Car.ser");
            ous = new ObjectOutputStream(fos);
            ous.writeObject(c);
            fos.close();
            ous.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
