package Calculations;

import java.util.ArrayList;

public class Cannonball
{
   private int mass;
   private double angle;
   private double speed;
   private double speedInX;
   private double speedInY;
   private Location currentLocation;
   private ArrayList<Location> locations;
   private final double G = 9.8;

    public Cannonball(int x, int y,int mass, double angle, double speed)
    {
        this.mass = mass;
        this.angle = angle;
        this.speed = speed;
        locations = new ArrayList<>();
        currentLocation = new Location(x,y);
        locations.add(new Location(x,y));
        speedInX = speed * Math.cos(angle* Math.PI/180);
        speedInY = speed * Math.sin(angle* Math.PI/180);
    }

    public double getX() {
        return currentLocation.getX();
    }

    public double getY() {
        return currentLocation.getY();
    }



    public int getMass() {
        return mass;
    }

    public double getAngle() {
        return angle;
    }

    public double getSpeed() {
        return speed;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public void launch()
    {
        int timeStep = 0;
        while(currentLocation.getY() >= 0)
        {
            timeStep++;
            updateSpeed(timeStep);
        }
    }

    private void updateSpeed(int timeStep)
    {

        this.speedInY = speedInY- G*timeStep;
        this.speed = Math.sqrt((speedInX*speedInX) + (speedInY*speedInY));
        updateLocation();
    }

    private void updateLocation()
    {
        double x = currentLocation.getX();
        double y = currentLocation.getY();
        this.currentLocation.setX(x + speedInX);
        this.currentLocation.setY(y + speedInY);
       if(currentLocation.getY()>=0)
       {
           locations.add(new Location(x + speedInX,y + speedInY));

       }
       else
       {
           locations.add(new Location(x+speedInX, 0));
       }


    }



}
