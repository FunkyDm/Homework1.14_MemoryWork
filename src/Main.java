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

        Person person = new Person ("Lyapis", "Trubetskoy");
        System.out.println(person.toString());
        person.changePerson(person);
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

//## Задание 5
//
//        Напишите метод, который изменяет значение переменной типа int. Объявите метод changeValue,
//        который принимает параметр типа int под названием value. Внутри метода с помощью оператора присваивания
//        запишите в параметр значение 22.
//
//В методе main объявите переменную типа int под названием value и запишите туда значение 33. В следующей строке вызовите
// метод changeValue и передайте в него эту переменную.
//
//        ## Задание 6
//
//        Напишите метод, который изменяет значение переменной типа Integer. Объявите метод changeValue,
//        который принимает параметр типа Integer под названием value. Внутри метода с помощью оператора присваивания
//        запишите в параметр значение 22.
//
//В методе main объявите переменную типа Integer под названием value и запишите туда значение 33.
// В следующей строке вызовите метод changeValue и передайте в него эту переменную.
//
//        ## **Задание 7**
//
//        Напишите метод, который изменяет значение массива типа Integer. Объявите метод changeValue,
//        который принимает параметр массива типа Integer под названием value.
//        Внутри метода с помощью оператора присваивания запишите в параметр новый массив {1,2}.
//
//В методе main объявите массив типа Integer под названием value и запишите туда значение {3,4}.
// В следующей строке вызовите метод changeValue и передайте в него этот массив.
//
//        ## **Задание 8**
//
//        Напишите метод, который изменяет значение массива типа Integer. Объявите метод changeValue,
//        который принимает параметр массива типа Integer под названием value.
//        Внутри метода с помощью оператора присваивания запишите в первую ячейку параметра цифру 99.
//
//В методе main объявите массив типа Integer под названием value и запишите туда значение {3,4}.
// В следующей строке вызовите метод changeValue и передайте в него этот массив.
//
//        ## **Задание 9**
//
//Объявите объект класса person с полями name и surname. Переопределите у него метод toString так,
// чтобы он возвращал строку из name и surname. Объявите метод changePerson, который принимает параметр типа Person под названием person.
// Внутри метода с помощью оператора присваивания запишите в параметр новый объект типа Person. Присвойте строке name значение Ilya,
// строке surname — значение Lagutenko.
//
//В методе main объявите переменную типа Person под названием person и запишите новый объект типа Person.
// Присвойте строке name значение Lyapis, строке surname значение — Trubetskoy.
//
//В следующей строке вызовите метод changePerson и передайте в него эту переменную.
//
//        ## Задание 10
//
//Объявите объект класса person с полями name и surname.
// Переопределите у него метод toString так, чтобы он возвращал строку из name и surname. Объявите метод changePerson,
// который принимает параметр типа Person под названием person. Внутри метода запишите в поле name строку “Ilya”,
// а в строку surname — “Lagutenko”.
//
//В методе main объявите переменную типа Person под названием person и запишите новый объект типа Person.
// Присвойте значение имени Lyapis, фамилии — Trubetskoy.
//
//В следующей строке вызовите метод changePerson и передайте в него эту переменную.
