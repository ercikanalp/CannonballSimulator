package Calculations;

public class Tower {
    private Location location;
    private double height;

    public Tower(Location location, double height) {
        this.location = location;
        this.height = height;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}
