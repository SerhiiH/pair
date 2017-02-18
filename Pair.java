/**
 * Created by Сергей on 18.02.2017.
 */
public class Pair<L, R> {
    private final L left;
    private final R right;

    private Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public static <L, R> Pair<L, R> getPair(L left, R right) {
        return new Pair(left, right);
    }
    public L getLeft() {
        return left;
    }
    public R getRight() {
        return right;
    }
    public String toString() {
        return ("Pair[" + left + ", " + right + "]");
    }
}
