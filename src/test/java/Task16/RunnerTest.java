package Task16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunnerTest {
    @Test

    void shouldReturnIntermediateForGivenTimeOf200(){
        //given

        //when
        Runner result = Runner.getFitnessLevel(200);
        //then
        Assertions.assertEquals(Runner.INTERMEDIATE, result);
    }

    @Test
    void shouldThowException(){
        //when
        //Runner result2 = Runner.getFitnessLevel(400); przy testowaniu wyjątków robimy w jednej linijce
        //then
        Assertions.assertThrows(IllegalArgumentException.class, () ->Runner.getFitnessLevel(400));
    }

}