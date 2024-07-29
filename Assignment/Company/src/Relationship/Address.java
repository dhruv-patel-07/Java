package Relationship;

public class Address {
	private String flatno,socityname,area;

	public String getFlatno() {
		return flatno;
	}

	public void setFlatno(String flatno) {
		this.flatno = flatno;
	}

	public String getSocityname() {
		return socityname;
	}

	public void setSocityname(String socityname) {
		this.socityname = socityname;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", socityname=" + socityname + ", area=" + area + "]";
	}
}
