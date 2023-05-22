import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializer {
    FileOutputStream fos; //file eka open
    ObjectOutputStream oos; //object eka open

    public void serializerCat(Cat c){ // Serialize Karanna Oni Class ek
        try {
            fos = new FileOutputStream("G:\\SerFile\\Cat.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(c);
            fos.close();
            oos.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public  void serializerUniversityEmployee(UniversityEmployee uniEmp){
        try {
            fos = new FileOutputStream("G:\\SerFile\\uniEmp.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(uniEmp);
            fos.close();
            oos.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }





}
