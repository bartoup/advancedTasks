package Task17;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.within;
import static org.junit.jupiter.api.Assertions.*;

class MeasurementConverterTest {

    @Test
    void shouldConvertMetersToYards(){
        //given
        double input = 20.0;
        //when
        double result = MeasurementConverter.convert(input,ConversionType.METERS_TO_YARDS);
        //then
        assertThat(result).isCloseTo(21.87, within(0.01));
    }

}