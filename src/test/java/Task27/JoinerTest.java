package Task27;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JoinerTest {

    @Test
    void shouldReturnCorrectStringFromStrings(){
        //given
        Joiner<String> joiner = new Joiner<>("+");
        String expectedResult = "a+b+c+d";
        //when
String result = joiner.join("a", "b", "c","d");
        //then
        assertThat(result).isEqualTo(expectedResult);
    }
    @Test
    void shouldReturnCorrectStringFromIntegers(){
        //given
        Joiner<String> joiner = new Joiner<>("|");
        String expectedResult1 = "1|2|3|4";
        //when
        String result = joiner.join("1", "2", "3","4");
        //then
        assertThat(result).isEqualTo(expectedResult1);
    }

}