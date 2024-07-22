public class CallClock {
 public static void main(String[] args) {
    Clock obj = new Clock();
    obj.setClock(10203);
    obj.tick();
    obj.tick();
    obj.tick();
    obj.tick();
    obj.tick();
    obj.tickDown();
    System.out.println(obj);

    Clock obj2 = new Clock(12, 10, 10);
    System.out.println(obj2);
    obj.addClock(obj2);
    System.out.println(obj);


    

 }   
}
