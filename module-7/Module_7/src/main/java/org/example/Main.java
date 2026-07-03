// Garrett Woods Module 7.2

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        //Setting up test values
        Fan defaultFan = new Fan();

        Fan customFan = new Fan(Fan.FAST, true, 12.0, "Black");
        System.out.println("Non-Default Values");
        System.out.println(customFan.toString());

        defaultFan.setOn(true);
        defaultFan.setSpeed(Fan.FAST);
        defaultFan.setRadius(12.0);
        defaultFan.setColor("Black");

        //Restoring values to default
        defaultFan = new Fan();

        System.out.println("\nDefault Values");
        System.out.println(defaultFan.toString());

        //Displays classes without using toString()
        System.out.println("\nDisplay Fan Collection without using toString");

        //Creates the Collection
        Collection<Fan> fanList = new ArrayList<>();
        fanList.add(new Fan(Fan.SLOW, true, 8.5, "Blue"));
        fanList.add(new Fan(Fan.MEDIUM, false, 10.0, "White"));
        fanList.add(new Fan(Fan.FAST, true, 14.0, "Red"));

        displayFanCollection(fanList);
    }
    //Creates the output for the display
    public static void displayFanCollection(Collection<Fan> fans) {
        for (Fan fan: fans) {
            displayFan(fan);
            System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
        }
    }

    //Formats the output
    public static void displayFan(Fan fan) {
        if (fan.isOn()) {
            System.out.println("Fan Status: ON and running at " + fan.getSpeed() + ". The color is currently set to " + fan.getColor() + " and the radius is " + fan.getRadius());

        } else {
            System.out.println("Fan Status: OFF. The color is currently set to " + fan.getColor() + " and the radius is "+ fan.getRadius());
        }
    }
}

class Fan {
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = STOPPED;
    private boolean on = false;
    private double radius = 6.0;
    private String color = "white";


    //Default settings
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }
    //Sets up the argument
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this. on = on;
        this.radius = radius;
        this.color = color;
    }

    //Gets values for String
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    //Formats the toSting
    public String toString() {
        if (on) {
            return "Fan is ON. Running on "+ speed +", Color is set to " + color + " and the radius is "+ radius;
        } else {
            return "Fan is OFF. Color is " + color + " and the radius is " + radius;
        }
    }
}