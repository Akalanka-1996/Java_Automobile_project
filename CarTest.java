package com.company;
import java.util.*;

public class CarTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Set engine components

        Engine e = new Engine();
        System.out.print("Enter engine number:");
        String eNumber = input.nextLine();
        e.setEngineNumber(eNumber);

        System.out.print("Set number of cylinders:");
        int cNumber = input.nextInt();
        e.setNoOfCylinders(cNumber);

        System.out.print("Set engine capacity:");
        int cpNumber = input.nextInt();
        e.setCapacity(cpNumber);

        System.out.println("The engine "+ e.getEngineNumber()+ " has " + e.getCapacity() + " of capacity and "+e.getNoOfPistons()+" pistons." );

        //set chassis

        Chassis ch = new Chassis();

        System.out.print("\nEnter chassis number:");
        int chNumber = input.nextInt();
        ch.setChassisNo(chNumber);

        System.out.print("Set chassis weight:");
        int chWeight = input.nextInt();
        ch.setChassisWeight(chWeight);

        System.out.println("The chassis "+ch.getChassisNo()+ " has "+ch.getChassisWeight() +" of weight.");

        //set drive train

        DriveTrain d = new DriveTrain();
        System.out.print("Enter torque value:");
        float tvalue = input.nextFloat();
        d.setTorque(tvalue);

        System.out.println("The torque value is "+ d.getTorque());

        //set fuel type

        Fuel f = new Fuel();
        System.out.print("Select Amount of fuel:");
        int fAmount = input.nextInt();
        f.setFuelType(fAmount);

        System.out.println("The vehicle uses "+ f.getGallons() +" amount of fuel");

        //set diesel

        Diesel ds = new Diesel();
        System.out.print("Select cetane rating for the diesel:");
        int cetRating = input.nextInt();
        ds.setCetaneRating(cetRating);

        System.out.println("Cetane rating for diesel is "+ ds.getCetaneRating()+ ".");

        //set wheel type

        Wheels w = new Wheels();
        System.out.print("Select number of tyres: ");
        int tNum = input.nextInt();
        w.setNumberOfWheels(tNum);

        System.out.println("The number of tyre is "+ w.getNumberOfWheels()+".");

        //set car

        System.out.println("Let's move the vehicle");

        Car cr = new Car();

        cr.moveForward();
        cr.turnLeft();
        cr.moveForward();
        cr.turnRight();
        cr.moveBackward();



    }
}
