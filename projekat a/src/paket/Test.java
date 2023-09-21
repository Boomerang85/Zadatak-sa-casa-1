package paket;

public class Test {

	public static void main(String[] args) 
	{
		Fridge point1 = new Fridge();
		
		point1.setKobasica(10);
		point1.setSir(5);
		
		System.out.println("Ima " + point1.getKobasica() + "kobasica");
		System.out.println("Ima " + point1.getSir() + "sira");
		System.out.println("Ima hrane u frizideru " + point1.isIma());
		
		double distanceResult = point1.distance(15, 7);
		System.out.println(distanceResult);
		
		System.out.println(point1);
	}

}
