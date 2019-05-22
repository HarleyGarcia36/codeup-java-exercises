package shapes;

public class ShapesTest {

    public static void main(String[] args) {


//        Rectangle box1 = new Rectangle(5, 4);
//
//        Square box2 = new Square(5);
//
//        System.out.println("Box 1:");
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//        System.out.println("\nBox 2:");
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

        Measurable box1 = new Square(5);
        Measurable box2 = new Rectangle(5, 2);

        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());
        System.out.println("\n");
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

    }

}
