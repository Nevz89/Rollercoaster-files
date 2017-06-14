
public class Rollercoaster {
	public String name;
	public String manufacturer;
	public double height;
	public int lenght;
	public int trains;
	public int speed;
	public boolean inversions;
	
	public Rollercoaster(String name, String manufacturer, double height, int lenght, int trains, int speed, boolean inversions){
		this.name = name;
		this.manufacturer = manufacturer;
		this.height = height;
		this.lenght = lenght;
		this.trains = trains;
		this.speed = speed;
		this.inversions = inversions;
		
	}
	public void displayCoaster(){
		System.out.println("The rollercoaster has the name: "+this.name+ ".");
		System.out.println("The "+this.name+ " is built by "+this.manufacturer+ ".");
		System.out.println("The "+this.name+ " has a height of "+this.height+ " meters.");
		System.out.println("The "+this.name+ " has a lenght of "+this.lenght+ " meters.");
		System.out.println("The "+this.name+ " has "+this.trains+ " trains.");
		System.out.println("The "+this.name+ " has a speed of: "+this.speed+ " kilometers per hour.");
		String check;
		if(this.inversions){
			check = "does";
		}else{check = "does not";}
		System.out.println("The "+this.name+ " "+check+" have inversions."); 
		}
	}

