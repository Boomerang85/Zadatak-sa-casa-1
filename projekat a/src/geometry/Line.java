package geometry;

import java.awt.Graphics;

public class Line extends Shape 
{
	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
	public Line()
	{
		
	}
	
	public Line(Point startPoint, Point endPoint)
	{
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public double length(Point startPoint, Point endPoint)
	{
		double dx = endPoint.getX() - startPoint.getX();
		double dy = endPoint.getY() - startPoint.getY();
		double length = Math.sqrt(dx * dx + dy * dy);
		return length;
	}
	
	
	public Point getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	public Point getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public boolean equals(Object obj) 
	{

		if(obj instanceof Line) 
		{
			Line l = (Line)obj;

			if(l.startPoint == this.startPoint && l.endPoint == this.endPoint)

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
		Point newPoint = new Point(x, y);
		return this.length(startPoint, newPoint) <= 2 || this.length(endPoint, newPoint) <= 2; 
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}
}
