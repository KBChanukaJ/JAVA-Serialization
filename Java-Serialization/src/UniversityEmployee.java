import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ExecutionException;

public class UniversityEmployee extends Employee implements Serializable {
    private int uid;

    public UniversityEmployee(String name, int age, int uid) {
        super(name, age);
        this.uid = uid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }


    private void writeObject(ObjectOutputStream ous) throws  Exception{
        ous.defaultWriteObject(); //default Constructor
        ous.writeObject(getName()); // get name from employee class // String is object because of that we get writeObject
        ous.writeInt(getAge()); // get age from employee
    }

    private void readObject(ObjectInputStream ois) throws Exception{
        ois.defaultReadObject();
        setName((String) ois.readObject()); // name eka set krnw api // String dala tynne type cast krnna object ekk ganne api string ekk hinda
        setAge(ois.readInt());
    }

    @Override
    public String toString() {
        return "UniversityEmployee{" +
                "name= " + getName() + " " +
                "age= " + getAge() + " " +
                "uid= " + uid +
                '}';
    }
}
