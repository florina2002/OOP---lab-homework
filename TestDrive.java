import java.awt.Color;
/**
 * TestDrive demonstrates creating and calling
 * methods on Car object.
 *
 * @author Laboratory Team
 */
public class TestDrive
{
    //The Java virtual machine (JVM) always starts
    //execution with the 'main' method of the class passed
    //as a argument to the java command
    public static void main(String []args)
    {
        TestDrive td = new TestDrive();
        Car car = new Car("Red Bull", Color.BLUE, 350, 300, 20);
        Car car1 = new Car("Mercedes", Color.white, 400, 320, 30);
        //td.start();
        driveCar(car);
        driveCar(car1);
        //exit TestDrive
    }
    private void start()
    {
        //Create a Volkswagen beetle Car
        Car beetle = new Car("Volskwagen Beetle", Color.orange, 80, 160, 10);
        //Take it for a drive
        System.out.println("Starting beetle test drive!");
        driveCar(beetle);
        //Create a Ferrari
        Car ferrari = new Car("Ferrari Testarosa", Color.red, 300, 280, 30);
        //Take it for a drive
        System.out.println("Starting ferrari test drive!");
        driveCar(ferrari);
    }
    public static void driveCar(Car c)
    {
        System.out.print("Car is a " + c.getBrandName());
        System.out.println(" colored " + c.getColor());
        System.out.print("\t engine power is " + c.getPower());
        System.out.println(" speeding step is " +c.getAcceleration());
        //press the accelerator 15 "times"
        for(int i = 0; i < 15; i++) {
            System.out.println("accelerating: " + c.accelerate());
        }
        //release the accelerator 5 "times"
        for(int i = 0; i < 5; i++) {
            ;
            System.out.println("decelerating: " + c.decelerate());
        }
        System.out.println("final cruising speed: " + c.getSpeed());
    }
}