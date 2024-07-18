public class CallPlanet {
    public static void main(String[] args) {
        Planet p = new Planet();
        p.setName("Moon");
        p.setDistanceFromSun(100000.21);
        p.setGravity(45.5);
        System.out.println(p);
    }
}
