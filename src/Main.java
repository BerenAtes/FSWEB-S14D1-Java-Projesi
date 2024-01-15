
import com.workintech.s14d1.Circle;
import com.workintech.s14d1.Cylinder;
import com.workintech.s14d1.Rectangle;
import com.workintech.s14d1.Cuboid;
import com.workintech.s14d1.Employee;
import com.workintech.s14d1.HRManager;
import com.workintech.s14d1.JuniorDeveloper;
import com.workintech.s14d1.MidDeveloper;
import com.workintech.s14d1.SeniorDeveloper;

public class Main {
    public static void main(String[] args) {

        System.out.println("Silindir********************");
        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());

        System.out.println("**********************************");
        System.out.println("Havuzun Alanı********************");
        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("**********************************");
        System.out.println("Employee********************");

        String [] Employee= new String[5];

        JuniorDeveloper junior1 = new JuniorDeveloper(1,"Ahmet ",36000);
        JuniorDeveloper junior2 = new JuniorDeveloper(2, "Mehmet ",38000);

        MidDeveloper mid1 = new MidDeveloper(3, "Beren ",47000);

        MidDeveloper mid2 = new MidDeveloper(4, "Deniz ",49000);

        SeniorDeveloper senior1 = new SeniorDeveloper(5, "Ayşe ",57000);

        senior1.work();
        mid2.work();
        junior2.work();






    }
}