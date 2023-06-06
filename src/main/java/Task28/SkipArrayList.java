package Task28;

import java.util.ArrayList;
import java.util.List;

public class SkipArrayList<T> extends ArrayList<T> {

    public List<T> getEveryNthElement(int startIndex, int skip){
        List<T> everyNthElement = new ArrayList<>();
        int currentIndex = startIndex;
        while (currentIndex<size()){
            T currentValue = get(currentIndex);
            everyNthElement.add(currentValue);
            currentIndex += skip + 1;
        }
        return everyNthElement;
    }
}
