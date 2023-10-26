package geometry;

import java.awt.Graphics;

public class Cube extends Shape
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
	
	public boolean equals(Object obj) 
	{

		if(obj instanceof Rectangle) 
		{
			Cube c = (Cube)obj;

			if(c.base == this.base && c.height == this.height)

				return true;

			else
				return false;
		}
		else 
			return false;
	}
	@Override
	public boolean contains(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}
}
