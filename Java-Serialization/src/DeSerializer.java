import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializer {
    FileInputStream fis;
    ObjectInputStream ois;

    public void deSerializeCat(){ // file mukuth input karaganna oni naha
        try {
            fis = new FileInputStream("G:\\SerFile\\Cat.ser");
            ois = new ObjectInputStream(fis);
            Cat c =(Cat) ois.readObject(); //type casting
            System.out.printf("OutPut is: "+c.toString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deSerializeUniversityEmployee(){
        try{
            fis = new FileInputStream("G:\\SerFile\\uniEmp.ser");
            ois = new ObjectInputStream(fis);
            UniversityEmployee uniEmp =(UniversityEmployee) ois.readObject();
            System.out.println("OutPut is: "+uniEmp.toString());

        }catch (Exception e){

        }
    }
}
