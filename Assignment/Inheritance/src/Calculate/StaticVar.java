package Calculate;
public class StaticVar {
	public static String txt= "Hello"; 
	static int count =0;
	int i = 0;
	
	public StaticVar() {
		i++;
		count++;
	}
	public static void getData() {
		System.out.println(count);
//		System.out.println(i);
	}
	
	static {
	System.out.println("---Static Block---");
	}

	@Override
	public String toString() {
		return count+" :- StaticVar [i=" + i + "]";
	}
}
