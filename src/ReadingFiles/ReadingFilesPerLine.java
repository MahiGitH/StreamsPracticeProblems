package ReadingFiles;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingFilesPerLine {

    public static void main(String[] args){
        //Scanner scan = new Scanner(System.in);
        try (Scanner scanner = new Scanner(System.in)) {
        }
        Read("src/ReadingFiles/file");

    }
    public static List<String> Read(String file){
        List<String> presidents = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).forEach(row -> presidents.add(row));
            presidents.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return presidents;
    }
}
