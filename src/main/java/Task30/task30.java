package Task30;

import javax.xml.stream.events.StartDocument;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class task30 {
    //1
    public static void main(String[] args) {
        Path dirPath = Path.of("src/main/java/Task30");
        Path inputFile = dirPath.resolve("course.txt");
        //2
        if (!inputFile.toFile().exists()) {
            System.out.println("File not exist");
            return;
        }
        List<String> contents = new ArrayList<>();
        //4
        try {
            contents = getFileContent(inputFile);
        } catch (IOException e) {
            System.out.println("Exception during opening file: " + e);
        }

        //6
        List<String> reversedContent = reverseContent(contents);
        System.out.println(reversedContent);
        //8
        Path reversedFileName = reverseFileName(inputFile);
        System.out.println(reversedFileName);
        //10
        try {
            saveFile(reversedFileName, reversedContent);
        } catch (IOException e) {
            System.out.println("Exception during saving file: " + e);
        }
    }

    //3
    private static List<String> getFileContent(Path inputFile) throws IOException {
        return Files.readAllLines(inputFile);
    }

    //5
    private static List<String> reverseContent(List<String> content) {
        return content.stream()
                //.map(s -> StringBuilder(s).reverse().toString
                //map(s -> reverseString(s));
                .map(task30::reverseString).collect(Collectors.toList());
    }

    //5.1
    private static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    //7
    private static Path reverseFileName(Path inputFile) {
        String fileName = inputFile.toFile().getName();
        String fileExtension = "";
        int index = fileName.indexOf(".");
        if (index > 0) {
            //ponieważ jeżeli nie występuje to indexOf zwraca -1. Jeżeli index > 0 to znaczy, że plik ma rozszerzenie
            fileExtension = fileName.substring(index); //dwie metody substring - ta poda .txt
            fileName = fileName.substring(0, index); //wyciągnie course
        }
        String reversedInputFile = new StringBuilder(fileName).reverse().append(fileExtension).toString();
        return inputFile.getParent().resolve(reversedInputFile);
    }
    //9
    private static void saveFile(Path reversedFileName, List<String> content) throws IOException {
        Files.write(reversedFileName,content, StandardCharsets.UTF_8);
    }
}
