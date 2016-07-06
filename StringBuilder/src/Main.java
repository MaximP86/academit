/**
 * Created by 1 on 11.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder();
        for (int i = 1; i <= 100; ++i) {
            a.append(i).append(", ");
        }
        a.delete(a.length() - 2, a.length());
        System.out.println(a);
    }
}
