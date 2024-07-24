package Constructur_inheritance;

public class DemovV {
	public static void main(String[] args) {
		TwoWheeler tw = new TwoWheeler("BMW","Petrol");
		System.out.println(tw);
		
		Vechiel v = new TwoWheeler("BM", "Car");
		System.out.println(v);
		
		System.out.println(v instanceof Vechiel);
	}
	
}

///
