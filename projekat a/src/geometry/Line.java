package geometry;

public class Line 
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
}
