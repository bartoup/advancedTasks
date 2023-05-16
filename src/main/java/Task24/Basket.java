package Task24;

import Task24.Exception.BasketEmptyException;
import Task24.Exception.BasketFullException;

public class Basket {
    private static final int MAX_CAPACITY = 10;
    private static final int MIN_CAPACITY = 0;
    private int items;

    public Basket() {
        items = 0;
    }

    public void add(){
    if(items>= MAX_CAPACITY){
        throw new BasketFullException("To many items in the basket");
    }
    items++;
    }

    public void remove(){
        if(items<= MIN_CAPACITY){
            throw new BasketEmptyException("Cannot remove from empty basket");
        }
        items--;
    }
}
