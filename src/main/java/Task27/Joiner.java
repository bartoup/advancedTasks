package Task27;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joiner<T> {
    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... parts){
       return Arrays.stream(parts)
                //.map(t-> t.toString())
                .map(Object::toString)
                .collect(Collectors.joining(separator));

    }
}
