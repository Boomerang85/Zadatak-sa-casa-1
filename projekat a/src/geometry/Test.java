package geometry;

public class Test {

	public static void main(String[] args) 
	{
		//Ovo je zadatak sa proslog casa (proveri Point.java)
		
		//Point point1 = new Point();
		
		//point1.setX(10);
		//point1.setY(5);
		
		//System.out.println("X koordinata tacke je " + point1.getX());
		//System.out.println("Y koordinata tacke je " + point1.getY());
		//System.out.println("Da li je tacka selektovana " + point1.isSelected());
		
		//double distanceResult = point1.distance(15, 7);
		//System.out.println(distanceResult);
		
		//System.out.println(point1);
		
		
		//Ovo je prvi zadatak (proveri Line.Java)
		
		
		//Point point1 = new Point(2, 3);
		//Point point2 = new Point(4, 5);
		//Line line1 = new Line();
		
		//System.out.println(line1.length(line1.getStartPoint(), line1.getEndPoint()));  
		
		//int height = 12;
		//int width = 5;
		
		//Rectangle rectangle1 = new Rectangle();
		
		//System.out.println(rectangle1.area(height, width));  
		//System.out.println(rectangle1.circumference(height, width));  
		
		//Circle circle1 = new Circle();
		//circle1.setRadius(4);
		
		//System.out.println(circle1.area());  
		//System.out.println(circle1.circumference());
		
		Cube cube1 = new Cube();
		Rectangle rectangle1 = new Rectangle();
		
		rectangle1.setHeight(4);
		rectangle1.setWidth(4);
		cube1.setHeight(4);
		
		System.out.println(cube1.volume(rectangle1, cube1.getHeight()));
	}

}
