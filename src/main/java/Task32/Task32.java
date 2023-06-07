package Task32;

import java.io.*;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task32 {
    public static void main(String[] args) {
        Path dirPath = Path.of("src/main/java/Task32");
        Path inputFile = dirPath.resolve("cars.txt");
        List<Car> cars = List.of(
                new Car("Volvo", 300.000, true),
                new Car("GLS", 200.000, false),
                new Car("<X500>", 50.000, false)
        );
        //save(inputFile, cars);
        List<Car> result = load(inputFile);
        System.out.println(result);
        System.out.println(result.size());
    }

    private static void save(Path inputFile, List<Car> content){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(inputFile.toFile()))){
            oos.writeObject(content);
        } catch (IOException e) {
            System.out.println("Exception during save file" + e);
        }
    }
    private static List<Car> load(Path file){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file.toFile()))){
            return (List<Car>) ois.readObject();
        } catch (IOException e) {
            System.out.println("Exception during opening file" + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Exception during creating list of cars" + e);
        }
        return Collections.emptyList();
    }
}
