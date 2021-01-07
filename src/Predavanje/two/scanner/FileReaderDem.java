package Predavanje.two.scanner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderDem {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("output.txt");
             BufferedReader br = new BufferedReader(fileReader);
             Scanner scanner = new Scanner(br)) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException exception) {
            System.err.println(exception.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
