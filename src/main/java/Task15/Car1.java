package Task15;

import java.util.EnumSet;

public enum Car1 {
    FERRARI(15,300),
    PORSCHE(20,400),
    MERCEDES(30, 420),
    BMW(10,290),
    OPEL(8,170),
    FIAT(3,120),
    TOYOTA(7, 190);

    private final int power;
    private final int price;
    private final static EnumSet<Car1> premiumCars = EnumSet.of(FERRARI,PORSCHE,MERCEDES);

    Car1(int price, int power) {
        this.price = price;
        this.power = power;
    }
    public boolean isPremium() {
        return premiumCars.contains(this);
    }

    static public boolean isPremium(Car1 car1) {
        return premiumCars.contains(car1);
    }

    public boolean isRegular() {
        return !isPremium();
    }

    static public boolean isRegular(Car1 car1) {
        return !isPremium(car1);
    }

    public boolean isFasterThan(Car1 car1) {
        return this.compareTo(car1) < 0;
    }

}
