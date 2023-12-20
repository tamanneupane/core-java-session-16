package inputandoutput;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(Path.of("file.txt"));

        while (true){
            System.out.println(scanner.next());
        }

    }
}
