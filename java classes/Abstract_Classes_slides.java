abstract class Object{
    public abstract void draw();
}
class Square extends Object{
    public void draw(){
        System.out.println("square has four sides");
        System.out.println("All the four sides of sqaure are equal");
    }
}
class Circle extends Object{
    public void draw() {
        System.out.println("Circles are round in shape");
        System.out.println("Circle have center point and radius");
    }
}
public class Abstract_Classes_slides {
    public static void main(String[] args) {
//        for circle class
        Object c = new Circle();
        c.draw();
//        for square class
        Object s = new Square();
        s.draw();
    }

}
