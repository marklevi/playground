public class Tuple implements Comparable<Tuple> {
    private final Integer x;
    private final Integer y;

    public Tuple(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getY() {
        return y;
    }

    public Integer getX() {
        return x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tuple tuple = (Tuple) o;

        if (x != null ? !x.equals(tuple.x) : tuple.x != null) return false;
        if (y != null ? !y.equals(tuple.y) : tuple.y != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = x != null ? x.hashCode() : 0;
        result = 31 * result + (y != null ? y.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Tuple other) {
        return Integer.compare(getX(), other.getX());
    }
}