package test0623;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 比较两个list的不同，列出差异部分：包括左侧独有，右侧独有，双方都有
 *
 * @author <a href=mailto:zhanggeng.zg@antfin.com>GengZhang</a>
 */
public class ListDifference<T> {

    /**
     * The Only on left.
     */
    private List<T> onlyOnLeft;

    /**
     * The Only on right.
     */
    private List<T> onlyOnRight;

    /**
     * The On both.
     */
    private List<T> onBoth;

    /**
     * Difference list difference.
     *
     * @param left  the left
     * @param right the right
     */
    public ListDifference(List<? extends T> left, List<? extends T> right) {
        if ((left == null || left.size() == 0) || (right == null || right.size() == 0)) {
            this.onlyOnLeft = Collections.unmodifiableList(left == null ? new ArrayList<T>() : left);
            this.onlyOnRight = Collections.unmodifiableList(right == null ? new ArrayList<T>() : right);
            this.onBoth = Collections.unmodifiableList(new ArrayList<T>());
            return;
        }
        boolean switched = false;
        boolean leftSmallerThanRight = left.size() < right.size();
        if (leftSmallerThanRight) { // 做优化，比较大小，只遍历少的
            List<? extends T> tmp = left;
            left = right;
            right = tmp;
            switched = true;
        }

        List<T> onlyOnLeft = new ArrayList<T>();
        List<T> onlyOnRight = new ArrayList<T>(right);
        List<T> onBoth = new ArrayList<T>();

        for (T leftValue : left) {
            if (right.contains(leftValue)) {
                onlyOnRight.remove(leftValue);
                onBoth.add(leftValue);
            } else {
                onlyOnLeft.add(leftValue);
            }
        }
        // unmodifiableList 返回的是不可变List,无法add元素,原因是为了保护结果集
        this.onlyOnLeft = Collections.unmodifiableList(switched ? onlyOnRight : onlyOnLeft);
        this.onlyOnRight = Collections.unmodifiableList(switched ? onlyOnLeft : onlyOnRight);
        this.onBoth = Collections.unmodifiableList(onBoth);
    }

    /**
     * Are equal.
     *
     * @return the boolean
     */
    public boolean areEqual() {
        return onlyOnLeft.isEmpty() && onlyOnRight.isEmpty();
    }

    /**
     * Gets only on left.
     *
     * @return the only on left
     */
    public List<T> getOnlyOnLeft() {
        return onlyOnLeft;
    }

    /**
     * Gets only on right.
     *
     * @return the only on right
     */
    public List<T> getOnlyOnRight() {
        return onlyOnRight;
    }

    /**
     * Gets on both.
     *
     * @return the on both
     */
    public List<T> getOnBoth() {
        return onBoth;
    }
}