import java.util.*;
interface GeometricObject {
    int getPerimeter();
    int getArea();
}
interface Resizable{
    abstract int resize();
}
class Circle implements GeometricObject{
    int radius;
    Circle(int radius){
        this.radius=radius;
    }
    public int getPerimeter(){
        return (int)(2*3.14*radius);
    }
    public int getArea(){
        return (int)(2*3.14*radius*radius);
    }
}
class ResizableCircle extends Circle implements Resizable{
    int radius;
    ResizableCircle(int radius){
        super(radius);
    }
    public int resize(){
        int szechng;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value by which radius needs to be changed: ");
        szechng=sc.nextInt();
        radius=radius+szechng;
        return radius;
    }
    public int getPerimeter(){
        return (int)(2*3.14*radius);
    }
    public int getArea(){
        return (int)(2*3.14*radius*radius);
    }
}
public class TestResizableCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle: ");
        int rad =sc.nextInt();
        Circle c = new Circle(rad);
        System.out.println("Perimeter of the OG circle: "+c.getPerimeter());
         System.out.println("Area of the OG circle: "+c.getArea());
        ResizableCircle rc = new ResizableCircle(rad);
        rc.resize();
        System.out.println("Perimeter of the resized Circle: "+rc.getPerimeter());
        System.out.println("Area of the resized Circle: "+rc.getArea());

    }
}
