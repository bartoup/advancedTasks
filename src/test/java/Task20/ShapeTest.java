package Task20;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test

    void shouldCalculatePerimeterOfRectangle(){
        //given
        Shape rectangle = new Rectangle(5,5);

        //when
        double result = rectangle.calculatePerimeter();
        //then
        assertThat(result).isEqualTo(20);
    }
}