public class Pair<T, V> {
    private T first;
    private V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public void display() {
        System.out.println("first: [" + first + "], second: [" + second + "]");
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hello", 42);
        pair.display();
    }
}
