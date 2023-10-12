package geometry;

public class Cube 
{
	private Rectangle base;
	private double height;
	private boolean selected;
	
	private int a;
	
	public Cube()
	{}
	public Cube(Rectangle base, double height)
	{
		this.base=base;
		this.height=height;
	}
	public Cube(Rectangle base, double height, boolean selected)
	{
		this.base=base;
		this.height=height;
	}
	
	public double volume(Rectangle base, double height)
	{
		return base.area() * height;
	}
	
	public Rectangle getBase() {
		return base;
	}
	public void setBase(Rectangle base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	
}