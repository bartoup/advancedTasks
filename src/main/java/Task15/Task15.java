package Task15;

public class Task15 {
    public static void main(String[] args) {
        Car1 car1 = Car1.OPEL;
        for(Car1 carToCompare : Car1.values()) {
            System.out.printf("Czy %s jest szybszy niz %s: %b\n", car1, carToCompare, car1.isFasterThan(carToCompare));
        }

        car1 = Car1.MERCEDES;
        for(Car1 carToCompare : Car1.values()) {
            System.out.printf("Czy %s jest szybszy niz %s: %b\n", car1, carToCompare, car1.isFasterThan(carToCompare));
        }

        System.out.printf("Czy %s jest premium: %b\n", car1, car1.isPremium());
        System.out.printf("Czy %s jest premium: %b\n", Car1.OPEL, Car1.isPremium(Car1.OPEL));
    }
}