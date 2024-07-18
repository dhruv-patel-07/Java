public class Planet {
    private String name;
    private double distanceFromSun;
    private double gravity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    @Override
    public String toString() {
        return "Planet \nname : " + name + ", \ndistanceFromSun : " + distanceFromSun + ", \ngravity : " + gravity + "";
    }
}
