package util;

public class Pair<T> {

    public T right;
    public T left;

    public Pair() {

    }

    public Pair(T right, T left) {
        this.right = right;
        this.left = left;
    }

    public T getRight() {
        return right;
    }

    public void setRight(T right) {
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public void setLeft(T left) {
        this.left = left;
    }

    public void remove(T object) {
        if (object == null) {
            return;
        }
        if (left != null && left.equals(object)) {
            left = null;
        }
        if (right != null && right.equals(object)) {
            right = null;
        }
    }

}
