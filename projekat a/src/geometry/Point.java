package geometry;

import java.awt.Graphics;

public class Point extends Shape
{
	private int x;
	private int y;
	private boolean selected;
	
	public Point()
	{
		
	}
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Point(int x, int y, boolean selected)
	{
		this.x = x;
		this.y = y;
		this.selected = selected;
	}
	
	public double distance(int x2, int y2)
	{
		int dx = x2 - x;
		int dy = y2 - y;
		double d = Math.sqrt(dx * dx + dy * dy);
		return d;
	}
	
	public int getX() 
	{
		return x;
	}
	public void setX(int x) 
	{
		this.x = x;
	}
	public int getY() 
	{
		return y;
	}
	public void setY(int y) 
	{
		this.y = y;
	}
	public boolean isSelected() 
	{
		return selected;
	}
	public void setSelected(boolean selected) 
	{
		this.selected = selected;
	}
	
	public boolean equals(Object obj) 
	{

		if(obj instanceof Point) 
		{
			Point p = (Point)obj;

			if(p.x == this.x && p.y == this.y)

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
		return this.distance (x, y) <= 2;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveTo(int x, int y) {
		// TODO Auto-generated method stub
		this.x = x;
		this.y = y;
	}

	@Override
	public void moveBy(int byX, int byY) {
		// TODO Auto-generated method stub
		this.x += byX;
		this.y += byY;
	}
}
