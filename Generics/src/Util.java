/**
 * Created by 1 on 23.06.2016.
 */
public class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getFirst().equals(p2.getFirst()) && p1.getSecond().equals(p2.getSecond());
        if (p1 == null && p2 == null) {
            return ;
        }
    }
}
