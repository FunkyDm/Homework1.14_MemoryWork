import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int value = 22;
//        System.out.println("Old value " + value);
//        changeValue(value);
//        System.out.println("New value " + value);
//

//        Integer value = 22;
//        System.out.println("Old value " + value);
//        changeValue(value);
//        System.out.println("New value " + value);

//        Integer[] value = new Integer[] {3,4};
//        System.out.println("Старый массив: " + Arrays.toString(value));
//        changeValue(value);
//        System.out.println("Новый массив: " + Arrays.toString(value));

//        Integer[] value = new Integer[] {3,4};
//        System.out.println("Старый массив: " + Arrays.toString(value));
//        changeValue2(value);
//        System.out.println("Новый массив: " + Arrays.toString(value));

//        Person person = new Person ("Lyapis", "Trubetskoy");
//        System.out.println(person.toString());
//        person.changePerson2(person);
//        System.out.println(person.toString());

        Person person = new Person ("Lyapis", "Trubetskoy");
        System.out.println(person.toString());
        person.changePerson2(person);
        System.out.println(person.toString());

    }

    public static void changeValue(int value){
        value = 33;
    }

    public static void changeValue(Integer value){
        value = 33;
    }

    public static void changeValue(Integer[] value){
        value = new Integer[]{1, 2};
    }

    public static void changeValue2(Integer[] value){
        value[0] = 99;
    }

}