/**
 * Created by 1 on 21.05.2016.
 */
public class Pair<K, V> {
    private K first;
    private V second;

    public Pair(K x, V y) {
        this.first = first;
        this.second = y;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public String toString() {
        return "[" + first + "," + second + "]";
    }
}
