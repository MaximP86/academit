/**
 * Created by 1 on 21.05.2016.
 */
public class Pair<K, V> {
    private K x;
    private V y;

    public Pair(K x, V y) {
        this.x = x;
        this.y = y;
    }

    public K getX() {
        return x;
    }

    public V getY() {
        return y;
    }

    public void setX(K x) {
        this.x = x;
    }

    public void setY(V y) {
        this.y = y;
    }

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getX().equals(p2.getX()) && p1.getY().equals(p2.getY());
    }

    public String toString() {
        return "[" + x + "," + y + "]";
    }
}
