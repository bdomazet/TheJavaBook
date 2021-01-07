package Predavanje.two.scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class ScannerExecutor {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            FileReader fileReader = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(fileReader);
            scanner = new Scanner(br);
            scanner.useLocale(Locale.CANADA);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
