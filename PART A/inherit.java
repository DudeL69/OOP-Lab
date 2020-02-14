import java.util.*;

class Circle{
    double radius;
    String color;
    Circle(double r){
        radius=r;
    }
    Circle(double r,String c){
        this(r);
        color=c;
    }
    double getRadius(){
        return radius;
    }
    double getArea(){
        return Math.PI*getRadius()*getRadius();
    }
}

class Cylinder extends Circle{
    double height;
    Cylinder(double h,double r){
        super(r);
        height=h;
    }
    Cylinder(double h,double r,String c){
        this(h,r);
        color=c;
    }
    double getHeight(){
        return height;
    }
    double getArea(){
        return 2*super.getArea()+getHeight()*2*Math.PI*getRadius();
    }
    double getVolume(){
        return Math.PI*getRadius()*getRadius()*getHeight();
    }
    static int compare(Cylinder c1,Cylinder c2){
        boolean flag=false;
        if(c1.color.equals(c2.color) && c1.getArea()==c2.getArea() && c1.getVolume()==c2.getVolume())
            flag=true;
        if(flag)
            return 1;
        else
            return 0;
    }
}

public class inherit{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("\nEnter the dimensions and details of the first cylinder ");
        System.out.print("\nRadius: ");
        double r=in.nextDouble();
        System.out.print("Height: ");
        double h=in.nextDouble();
        System.out.print("Color: ");
        String c=in.next();
        Cylinder c1=new Cylinder(h,r,c);
        System.out.print("\nEnter the dimensions and details of the second cylinder ");
        System.out.print("\nRadius: ");
        r=in.nextDouble();
        System.out.print("Height: ");
        h=in.nextDouble();
        System.out.print("Color: ");
        c=in.next();
        Cylinder c2=new Cylinder(h,r,c);
        if(Cylinder.compare(c1,c2)==1)
            System.out.print("\nCylinders are same...");
        else
            System.out.println("\nCylinders are different...");
    }
}