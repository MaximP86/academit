package academit.patarev.range;

/**
 * Created by 1 on 19.05.2016.
 */
public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double x) {
        if ((x >= from) && (x <= to)) {
            return true;
        }
        return false;
    }
}




