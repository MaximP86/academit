import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 1 on 04.06.2016.
 */
public class ExampleScanner {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(
                new FileInputStream("NewFile1"))) {
            ArrayList newList = new ArrayList();
            while (scanner.hasNextLine()) {
                String currentString = scanner.nextLine();
                newList.add(currentString);
            }
            System.out.println(newList);
        }
    }
}
