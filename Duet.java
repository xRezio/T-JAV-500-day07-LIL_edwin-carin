public class Duet {

  public static <T extends Comparable<T>> T min(T a, T b) {
    return a.compareTo(b) < 0 ? a : b;
  }

  public static <T extends Comparable<T>> T max(T a, T b) {
    return a.compareTo(b) > 0 ? a : b;
  }

}
