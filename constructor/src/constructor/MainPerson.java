package constructor;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("juan reales", 17);
        person.setName("felipe");
        System.out.println(person.getName());
    }
}

