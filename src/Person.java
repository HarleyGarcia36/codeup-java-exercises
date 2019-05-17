// Exercise 1 Object basics
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


// Exercise 2 understanding references
//    public static void main(String[] args) {
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//    }

}