/**
 * Created by 1 on 23.06.2016.
 */
public class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getX().equals(p2.getX()) && p1.getY().equals(p2.getY());
    }
}
