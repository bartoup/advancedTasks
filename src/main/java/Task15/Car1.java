package Task15;

public enum Car1 {
    FERRARI(15,300),
    PORSCHE(20,400),
    MERCEDES(30, 420),
    BMW(10,290),
    OPEL(8,170),
    FIAT(3,120),
    TOYOTA(7, 190);

    int price;
    int power;

    Car1(int price, int power) {
        this.price = price;
        this.power = power;
    }
    boolean isPremium(){
        return true;
    }

    boolean isRegular(){
        return false;
    }
}
