public class Person {

    private String name;

    private String surname;

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname;
    }

    public void changePerson(Person person){
        person = new Person("Lagutenko", "Ilya");
    }

    public void changePerson2(Person person){
        this.name = "Ilya";
        this.surname = "Lagutenko";
    }

}
