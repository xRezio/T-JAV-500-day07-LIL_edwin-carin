public class Solo<T> {
    private T value;

    public Solo(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Solo<String> strSolo = new Solo<>("toto");
        String strValue = strSolo.getValue();
        System.out.println("String Value: " + strValue);
        strSolo.setValue("tata");
        System.out.println("Updated String Value: " + strSolo.getValue());

        Solo<Integer> intSolo = new Solo<>(Integer.valueOf(42));
        Integer intValue = intSolo.getValue();
        System.out.println("Integer Value: " + intValue);
        intSolo.setValue(Integer.valueOf(1337));
        System.out.println("Updated Integer Value: " + intSolo.getValue());
    }
}
