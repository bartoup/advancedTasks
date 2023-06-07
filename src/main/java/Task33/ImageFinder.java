package Task33;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImageFinder {
    public static List<String> findImages(Path directory) {
        //założenie: plik ze zdjęciem to plik z roszerzeniem .jpg i .png
        try (Stream<Path> walk = Files.walk(directory)) {
//to do logic
            return walk
                    .map(p -> p.getFileName().toString())
//                .map(Path::toFile)
//                .map(File::getName)
                    .filter(i -> i.endsWith(".png") || i.endsWith(".jpg"))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("Exception");
        }
        return Collections.emptyList();
    }
}
