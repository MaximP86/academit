import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by 1 on 02.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(3.5, 2.1);
        System.out.println(rect1.getArea());

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("out.bin"))) {
            out.writeObject(rect1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("out.bin"))) {
            in.writeObject(rect1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
