package academit.patarev.range;

/**
 * Created by 1 on 19.05.2016.
 */
public class Range {
    private int from;
    private int to;

    public Range(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getRangeLength() {
        return Math.abs(to - from);

    }

    public void isInside(int x) {
        if (x > from && x < to) {
            System.out.println("Данное число принадлежит диапазону");
        } else {
            System.out.println("Данное число не принадлежит диапазону");
        }
    }
}



