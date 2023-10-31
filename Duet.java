public class Duet {
    public static <T extends Comparable<T>> T min(T value1, T value2) {
        if (value1.compareTo(value2) <= 0) {
            return value1;
        } else {
            return value2;
        }
    }

    public static <T extends Comparable<T>> T max(T value1, T value2) {
        if (value1.compareTo(value2) >= 0) {
            return value1;
        } else {
            return value2;
        }
    }

    public static void main(String[] args) {
        System.out.println("Min: " + Duet.min(3, 7)); // Should print: Min: 3
        System.out.println("Max: " + Duet.max(3, 7)); // Should print: Max: 7

        System.out.println("Min: " + Duet.min("apple", "orange")); // Should print: Min: apple
        System.out.println("Max: " + Duet.max("apple", "orange")); // Should print: Max: orange
    }
}
