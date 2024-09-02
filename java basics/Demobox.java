class Boxclass {
    public int height;
    public int width;
    public int length;
    Boxclass(){}
    Boxclass(int h, int w, int l){
        height = h;
        width = w;
        length = l;
    }
   void volume()
    {
        int v;
        v = this.height * this.width * this.length;
             System.out.println("voulme of box is " + v);
    }

}
public class Demobox {
    public static void main(String[] args) {
        Boxclass box = new Boxclass();
        box.height = 5;
        box.width = 4;
        box.length = 6;
        box = new Boxclass(12,3,4);
        box.volume();
    }
}
