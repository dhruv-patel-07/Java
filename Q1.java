
public class Q1
{
   public static void main(String[] args)
   {
      MyClass myObject1 = new MyClass(10);
      MyClass myObject2 = new MyClass(20);  
      myObject1.printX();
      myObject1.setX(14);
      myObject1.incrementCount();
      myObject1.printCount(); 
      myObject2.printCount();
      myObject2.printX();
      myObject1.incrementCount();
      myObject1.printX();
      myObject1.printCount();
      myObject2.printCount();      
   }
}