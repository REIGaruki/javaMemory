import java.util.Arrays;

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
        // задание 3
        Integer[] arrayValue = {3, 4};
        changeArrayValue(arrayValue);
        System.out.println(Arrays.toString(arrayValue)); // в консоль выводится [3, 4]
        // задание 4
        Integer[] valueTask4 = {3,4};
        changeValueTask4(valueTask4);
        System.out.println(Arrays.toString(valueTask4));
    }
    public static void changeValue(int value) {
        // внутрь медота changeValue подается переменная value из метода main
        value = 22; // далее медот работает уже с собственной переменной value, значение которой взято из
        // переменной value метода main. Ей присваивается значение "22", после чего метод завершается
        // и переменная value удаляется из памяти. Среда разработки выделяет внутреннюю переменную value
        // метода changeValue серым цветом, показывая что в методе main она использоваться не будет.
    }
    public static void changeIntegerValue(Integer integerValue) {
        // внутрь медота changeValue подается объект integerValue класса Integer из метода main
        integerValue = 22; // далее медот работает уже с собственным объектом integerValue, значение которого взято из
        // объекта integerValue метода main. Ему присваивается значение "22", после чего метод завершается
        // и объект integerValue удаляется из памяти.
    }
    public static void changeArrayValue(Integer[] arrayValue) {
        arrayValue = new Integer[]{1, 2};
        // под массив в методе выделяется новый блок памяти для локального использования
    }
    public static void changeValueTask4(Integer[] valueTask4) {
        valueTask4[0] = 99;
    }
}