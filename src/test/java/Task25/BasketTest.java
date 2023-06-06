package Task25;


import Task25.Basket;
import Task25.Exception.BasketEmptyException;
import Task25.Exception.BasketFullException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;


class BasketTest {
    private Basket basket;
    @BeforeEach
    void setUp(){
        basket=new Basket();
    }
    @Test

    void shouldNotBePossibleToAddNewItemWhenBasketIsFull() throws BasketFullException {
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

    private void initData() throws BasketFullException {
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