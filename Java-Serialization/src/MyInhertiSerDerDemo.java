public class MyInhertiSerDerDemo {
    public static void main(String[] args) {
        Serializer ser = new Serializer();
        DeSerializer deser = new DeSerializer();


//        Cat c = new Cat(10.0, "Black");
//        ser.serializerCat(c);
//        deser.deSerializeCat();

        UniversityEmployee uniemp = new UniversityEmployee("kamal" , 20 , 10);
        ser.serializerUniversityEmployee(uniemp);
        deser.deSerializeUniversityEmployee();

    }
}
