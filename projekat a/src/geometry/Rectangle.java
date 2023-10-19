package geometry;

public class Rectangle 
{
	private Point upperLeftPoint;
	private int width;
	private int height;
	private boolean isSelected;
	
	public Rectangle()
	{
		
	}
	
	public Rectangle(Point upperLeftPoint, int width, int height)
	{
		this.upperLeftPoint = upperLeftPoint;
		this.width = width;
		this.height = height;
	}
	
	public double area()
	{
		return height * width;
	}
	
	public double circumference(int width, int height)
	{
		return 2 * height + 2 * width;
	}

	public Point getUpperLeftPoint() {
		return upperLeftPoint;
	}

	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public boolean equals(Object obj) 
	{

		if(obj instanceof Rectangle) 
		{
			Rectangle r = (Rectangle)obj;

			if(r.upperLeftPoint == this.upperLeftPoint && r.height == this.height && r.width == this.width)

				return true;

			else
				return false;
		}
		else 
			return false;
	}
}
