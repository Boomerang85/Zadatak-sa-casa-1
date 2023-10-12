package geometry;

public class Circle 
{
	private Point center;
	private double radius;
	private Boolean isSelected;
	
	private double pi = Math.PI;
	
	public Circle()
	{
		
	}
	
	public Circle(Point center, double radius)
	{
		this.center = center;
		this.radius = radius;
	}

	public double area()
	{
		return radius * radius * pi;
	}
	
	public double circumference()
	{
		return 2 * radius * pi;
	}
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Boolean getIsSelected() {
		return isSelected;
	}

	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}
	
	
	
}
