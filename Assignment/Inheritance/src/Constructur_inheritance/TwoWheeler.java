package Constructur_inheritance;

public class TwoWheeler extends Vechiel{
	private String fule_type;
	
	

	public TwoWheeler(String Comp, String fule_type) {
		super(Comp);
		this.fule_type = fule_type;
	}



	@Override
	public String toString() {
		return fule_type + super.toString();
	}
}
