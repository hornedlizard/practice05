package prob6;

public class RectTriangle extends Shape {

	public RectTriangle(double w, double h) {
		setWidth(w);
		setHeight(h);
	}
	
	@Override
	public double getArea() {
		
		return (getWidth() * getHeight()) / 2;
	}

	@Override
	public double getPerimeter() {
		
		return getWidth()+getHeight()+Math.sqrt(Math.pow(getWidth(), 2)+Math.pow(getHeight(), 2));
	}

}
