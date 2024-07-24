package Constructur_inheritance;

public class Vechiel {
	private String Comp;

	public Vechiel(String Comp) {
		this.Comp = Comp;
		
	}

	@Override
	public String toString() {
		return " - "+Comp;
	}
}
