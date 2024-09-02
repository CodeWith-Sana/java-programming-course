class Box{
    double width, height, depth;
//    default constructor
    Box(){
    width =10; height =20; depth = 30;
    }
//    parametarized constructor
    Box(double w, double h , double d){
        width = w;
        height = h;
        depth = d;
    }
    Box (Box obj){
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    double Volume (){
        return width*height*depth;
    }
    public void display(){
        System.out.println("This is just a display function or method of the parent class");
    }
}

class Boxweight extends  Box{
    double weight;
    Boxweight(double width, double height, double depth, double weight){
        super.width = width;
        super.height = height;
        super.depth = depth;
        this.weight = weight;
    }
}
class BoxColor extends Box
{
    int color;
    BoxColor(double width, double height, double depth, int color){
        super.width = width;
        super.height = height;
        super.depth = depth;
        this.color = color;

    }
    @Override
    public void display(){
        super.display();
        System.out.println("This is the override function of the base class");
    }

}


public class BoxDemo {
    public static void main(String[] args)
    {
        Boxweight  w  = new Boxweight(10,15,29,25.5);
        System.out.println(w.Volume());

        BoxColor c  = new BoxColor(10,20,40,100);
        System.out.println(c.Volume());
        c.display();
    }


}
