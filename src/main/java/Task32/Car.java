package Task32;

import java.io.Serializable;

public class Car implements Serializable {
    private final String model;
    private final double price;
    private final boolean isNew;

    public Car(String model, double price, boolean isNew) {
        this.model = model;
        this.price = price;
        this.isNew = isNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (Double.compare(car.price, price) != 0) return false;
        if (isNew != car.isNew) return false;
        return model != null ? model.equals(car.model) : car.model == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = model != null ? model.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isNew ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", isNew=" + isNew +
                '}';
    }

}
