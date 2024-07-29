package Relationship;

public class CallPerson {
public static void main(String[] args) {
	Address addr =  new Address();
	addr.setSocityname("PHL");
	addr.setArea("Bopal");
	addr.setFlatno("C903");
	
	Person per = new Person();
	per.setPemail("abc@gmail.com");
	per.setPname("Dhruv");
	per.setAddr(addr);
	
	System.out.println(per);
	
}
}
