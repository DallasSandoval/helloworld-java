import java.util.Scanner;

public class circle {
    public float radius;

    public void setR() {
        radius=0;
    }
    
    public double getRadius() {
        System.out.println("输入半径");
        float scanner=new Scanner(System.in);
        radius=scanner;
    }

    public double getPerimeter() {
        Perimeter=2*3.14*radius;
    }

    public void disp() {

    }
}
