package Task20_21;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CubeTest {

    @Test

    void shouldCalculatePerimeterOfCube(){
        //given
        Shape3D cube = new Cube(2);
        //when
        double result = cube.calculatePerimeter();
        //then
        assertThat(result).isEqualTo(24);
    }
    @Test

    void shouldCalculateVolumeOfCube(){
        //given
        Shape3D cube = new Cube(2);
        //when
        double result = cube.calculateVolume();
        //then
        assertThat(result).isEqualTo(8);
    }

    @Test

    void shouldCheckFillMethod(){
        //given
        Shape3D cube = new Cube(2);
        //when
        double result = cube.fill(2);
        //then
        assertThat(result).isEqualTo(-1);
    }

}