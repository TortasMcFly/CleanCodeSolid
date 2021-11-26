package solid.solid_03_l;

public class Solid03 {

    public static void main(String []args) {
        String cardType = "car"; //"electric";

        if ("car" == cardType) {
            Car car = new Car();
            car.accelerate();
        } else if ("electric" == cardType) {
            ElectricCarBad electricCar = new ElectricCarBad();
            if ((electricCar.hasBattery())) {
                electricCar.accelerate();
            }
        } else {
            throw new RuntimeException("Invalid car");
        }
    }

}
