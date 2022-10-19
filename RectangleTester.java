public class RectangleTester
{
    public static void main(String[] args)
    {
        // Can call static methods
        // WITHOUT creating an object
        // Classname.method();


        // Cannot call non-static methods without
        // an object

        // WRONG
        //int area = Rectangle.area();

        // RIGHT

        Rectangle rect1 = new Rectangle(1,1);

        System.out.println(rect1.area());

        Rectangle.rectEquations();
        
    }
}