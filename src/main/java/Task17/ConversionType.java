package Task17;

import java.util.function.Function;

public enum ConversionType {
METERS_TO_YARDS(v->1.09*v),
    YARDS_TO_METERS(v->0.9*v),
    CENTIMETERS_TO_ICHES(v->0.39*v),
    INCHES_TO_CENTIMETERS(v-> 2.54*v),
    KILOMETERS_TO_MILES(v->0.62*v),
    MILES_TO_KILOMETERES(v->1.609*v);

private Function<Double, Double> converter;

    ConversionType(Function<Double, Double> converter) {
        this.converter = converter;
    }

    public Function<Double, Double> getConverter() {
        return converter;
    }
}
