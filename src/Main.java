public class Main {
    public static void main(String[] args) {
        // задание 1
        int value = 33; // объявляем переменную value
        changeValue(value); // применяем метод
        System.out.println(value); // в консоль выводится "33"
        // задание 2
        Integer integerValue = 33;
        changeIntegerValue(integerValue);
        System.out.println(integerValue);
    }
    public static void changeValue(int value) {
        // внутрь медота changeValue подается переменная value из метода main
        value = 22; // далее медот работает уже с собственной переменной value, значение которой взято из
        // переменной value метода main. Ей присваивается значение "22", после чего метод завершается
        // и переменная value удаляется из памяти. Среда разработки выделяет внутреннюю переменную value
        // метода changeValue серым цветом, показывая что в методе main она использоваться не будет.
    }
    public static void changeIntegerValue(Integer integerValue) {
        // внутрь медота changeValue подается переменная value из метода main
        integerValue = 22; // далее медот работает уже с собственной переменной integerValue, значение которой взято из
        // переменной integerValue метода main. Ей присваивается значение "22", после чего метод завершается
        // и переменная integerValue удаляется из памяти. Среда разработки выделяет внутреннюю переменную integerValue
        // метода changeValue серым цветом, показывая что в методе main она использоваться не будет.
    }
}