public class RunnerClass {
    public static void main(String[] args) {
        Serialization serialization = new Serialization();
        DeSerialization deSerialization = new DeSerialization();

        Car car = new Car("Blue" , 120);
        car.setGear(7);
        serialization.carSerialize(car);
        deSerialization.carDeSerialize();


    }
}
