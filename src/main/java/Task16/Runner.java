package Task16;

import java.util.Arrays;
import java.util.stream.Collectors;

public enum Runner {
    BEGINNER(240, 360),
    INTERMEDIATE(180, 240),
    ADVANCED(120, 180);

    int minMarathonTime;
    int maxMarathonTime;

    Runner(int minMarathonTime, int maxMarathonTime) {
        this.minMarathonTime = minMarathonTime;
        this.maxMarathonTime = maxMarathonTime;
    }

    static Runner getFitnessLevel(int marathonTime){
        return Arrays.stream(values())
                .filter(r -> marathonTime > r.minMarathonTime && marathonTime <= r.maxMarathonTime)
                .findFirst()
                //.orElse(BEGINNER);
                .orElseThrow(()-> new IllegalArgumentException("Podany czas jest spoza przedziału"));
    }
}
