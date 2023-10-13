package Task3_3;

public class Pair <T, S>{
    T item1;
    S item2;

    public Pair(T item1, S item2) {
        this.item1 = item1;
        this.item2 = item2;
    }
    public T getFirst() {
        return item1;
    }
    public S getSecond() {
        return item2;
    }

    @Override
    public String toString() {
        return item1 + " " + item2;
    }
}
