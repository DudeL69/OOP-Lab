import java.util.*;

class complex {
    private int re,im;
    complex()
    {}
    complex(int x,int y)
    {
       re=x;
       im=y;
    }
    public complex add(complex obj1,complex obj2)
    {
        complex obj3;
        obj3= new complex();
        obj3.re=obj1.re+obj2.re;
        obj3.im=obj1.im+obj2.im;
        return obj3;
    }
    public complex sub(complex obj1,complex obj2)
    {
        complex obj3;
        obj3= new complex();
        obj3.re=obj1.re-obj2.re;
        obj3.im=obj1.im-obj2.im;
        return obj3;
    }
    public void display(complex obj)
    {
        if(obj.im>=0)
            System.out.print(obj.re+"+"+obj.im+"i");
        else
            System.out.print(obj.re+""+obj.im+"i");
    }
}

public class cnos{
    public static void main(String[] args){
        complex c1,c2,adn,sbn;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the real and imaginary parts of first complex number: ");
        int r=s.nextInt();
        int im=s.nextInt();
        c1= new complex(r,im);
        System.out.print("Enter the real and imaginary parts of second complex number: ");
        r=s.nextInt();
        im=s.nextInt();
        c2= new complex(r,im);
        System.out.print("c1= ");
        c1.display(c1);
        System.out.print("\n");
        System.out.print("c2= ");
        c2.display(c2);
        System.out.print("\n");
        adn= new complex();
        sbn= new complex();
        adn= adn.add(c1,c2);
        sbn= sbn.sub(c1,c2);
        System.out.print("Sum= ");
        adn.display(adn);
        System.out.print("\n");
        System.out.print("Difference= ");
        sbn.display(sbn);
    }
}
