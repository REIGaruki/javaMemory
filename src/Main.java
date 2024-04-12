import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // задание 1
        int value = 33;
        changeValue(value);
        System.out.println(value);
        // задание 2
        Integer integerValue = 33;
        changeIntegerValue(integerValue);
        System.out.println(integerValue);
        // задание 3
        Integer[] arrayValue = {3, 4};
        changeArrayValue(arrayValue);
        System.out.println(Arrays.toString(arrayValue));
        // задание 4
        Integer[] valueTask4 = {3,4};
        changeValueTask4(valueTask4);
        System.out.println(Arrays.toString(valueTask4));
        // задание 5
        Person person1 = new Person("Lyapis", "Trubetskoy");
        changePerson1(person1);
        System.out.println(person1);
        Person person2 = new Person("Lyapis", "Trubetskoy");
        changePerson2(person2);
        System.out.println(person2);
    }
    public static void changeValue(int value) {
        value = 22;
    }
    public static void changeIntegerValue(Integer integerValue) {
        integerValue = 22;
    }
    public static void changeArrayValue(Integer[] arrayValue) {
        arrayValue = new Integer[]{1, 2};
    }
    public static void changeValueTask4(Integer[] valueTask4) {
        valueTask4[0] = 99;
    }
    public static void changePerson1(Person person) {
        String name = "Ilya";
        String surname = "Lagutenko";
    }
    public static void changePerson2(Person person) {
        person.name = "Ilya";
        person.setSurname("Lagutenko");
    }
}