package Calculate;

public class Circle {
		private double value;
		private final float pi = 3.14f;
		
		public Circle(float value) {
			super();
			this.value = value;
		}
		final double getArea() {
			double rs = value*value;
			double output = (double)pi*rs;
			return output;
		}
		
}


