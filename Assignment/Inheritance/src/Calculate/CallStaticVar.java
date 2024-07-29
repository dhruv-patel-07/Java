package Calculate;

public class CallStaticVar {
public static void main(String[] args) {
	StaticVar se = new StaticVar();
	System.out.println(se);
	
	StaticVar se1 = new StaticVar();
	System.out.println(se1);
	
	StaticVar se2 = new StaticVar();
	System.out.println(se2);
	
	System.out.println(StaticVar.txt);	
	System.out.println(StaticVar.count);
	
	System.out.println("Static Method");
	StaticVar.getData();
}
}
