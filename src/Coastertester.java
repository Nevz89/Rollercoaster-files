import java.util.ArrayList;


public class Coastertester {
	public static void main(String [] args){
		ArrayList list = new ArrayList();
		Rollercoaster taron = new Rollercoaster("Taron" , "Intamin", 29.0, 1320, 4, 117, false);
		list.add(taron);
		Rollercoaster elToro = new Rollercoaster("El Toro", "Intamin", 55.0, 1300, 2, 115, false);
		list.add(elToro);
		Rollercoaster banshee = new Rollercoaster("Banshee", "Bolliger & Mabillard", 51.0, 1257, 3, 109, true);
		list.add(banshee);
		Rollercoaster wildFire = new Rollercoaster("Wildfire", "Rocky Mountain Construction", 57.0, 1300, 2, 113, true);
		list.add(wildFire);
		Rollercoaster kingDaKa = new Rollercoaster("Kingda Ka", "Intamin", 139.0, 950, 4, 206, false);
		list.add(kingDaKa);
		Rollercoaster baron1898 = new Rollercoaster("Baron 1898", "Bolliger & Mabillard", 37.5, 501, 3, 90, true);
		list.add(baron1898);
		for(Object l : list){
		((Rollercoaster) l).displayCoaster();
		System.out.println("");
		}
	}
}
