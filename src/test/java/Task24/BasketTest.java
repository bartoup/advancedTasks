package Task24;

import Task24.Exception.BasketEmptyException;
import Task24.Exception.BasketFullException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.attribute.BasicWithKeyFileAttributeView;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    private Basket basket;
    @BeforeEach
    void setUp(){
        basket=new Basket();
    }
    @Test

    void shouldNotBePossibleToAddNewItemWhenBasketIsFull(){
        //given
        initData();
        //when && then
        assertThatThrownBy(() -> basket.add())
                .isInstanceOf(BasketFullException.class)
                .hasMessage("To many items in the basket");
    }
    @Test
    void shouldNotBePossibleToRemoveNewItemWhenBasketIsEmpty(){
        //when && then
        assertThatThrownBy(() -> basket.remove())
                .isInstanceOf(BasketEmptyException.class)
                .hasMessage("Cannot remove from empty basket");
    }

    private void initData() {
        basket.add();
        basket.add();
        basket.add();
        basket.add();
        basket.add();
        basket.add();
        basket.add();
        basket.add();
        basket.add();
        basket.add();
    }

}