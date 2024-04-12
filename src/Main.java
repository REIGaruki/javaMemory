public class Main {
    public static void main(String[] args) {
        int value = 33; // объявляем переменную value
        changeValue(value); // применяем метод
        System.out.println(value); // в консоль выводится "33"
    }
    public static void changeValue(int value) {
        // внутрь медота changeValue подается переменная value из метода main
        value = 22; // далее медот работает уже с собственной переменной value, значение которой взято из
        // переменной value метода main. Ей присваивается значение "22", после чего метод завершается
        // и переменная value удаляется из памяти. Среда разработки выделяет внутреннюю переменную value
        // метода changeValue серым цветом, показывая что в методе main она использоваться не будет.
    }
}