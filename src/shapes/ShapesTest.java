package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable box1 = new Square(5);
        Measurable box2 = new Rectangle(5, 2);

        System.out.println("My Square's perimeter & area:: \n" + box1.getPerimeter());
        System.out.println(box1.getArea());
        System.out.println("\n");
        System.out.println("My Rectangle's perimeter & area:: \n" + box2.getPerimeter());
        System.out.println(box2.getArea());

    }

}
