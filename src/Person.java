public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello %s\n", getName());
    }

    public Person(String name) {
        this.setName(name);
    }

    public static void main(String[] args) {
        Person harley = new Person("harley");
        harley.sayHello();
    }

    { Person person1 = new Person("John");
    Person person2 = new Person("John");
System.out.println(person1.getName().equals(person2.getName()));
System.out.println(person1 == person2); }

}