package day10_string;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilesWithScanner {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(Path.of( "src/day10_string/test.txt"));

        String test = scan.nextLine();
        String test2 = scan.nextLine();

        System.out.println(test);
        System.out.println(test2);

        scan.close();



    }
}
