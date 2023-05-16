package Task17;

public enum ConversionTypeOldSchool {
    METERS_TO_YARDS(1.09),
    YARDS_TO_METERS(0.9),
    CENTIMETERS_TO_ICHES(0.39),
    INCHES_TO_CENTIMETERS(2.54),
    KILOMETERS_TO_MILES(0.62),
    MILES_TO_KILOMETERES(1.609);

    private double value;

    ConversionTypeOldSchool(double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
