package _02_smurf;

public class SmurfRunner {
	public static void main(String [] args) {
		Smurf handySmurf= new Smurf("Handy");
		System.out.println(handySmurf.getName());
		handySmurf.eat();
		System.out.println(handySmurf.getHatColor());
		System.out.println(handySmurf.isGirlOrBoy());
		Smurf papaSmurf= new Smurf("Papa");
		System.out.println(papaSmurf.getName());
		papaSmurf.eat();
		System.out.println(papaSmurf.getHatColor());
		System.out.println(papaSmurf.isGirlOrBoy());
		Smurf smurfette= new Smurf("Smurfette");
		System.out.println(smurfette.getName());
		smurfette.eat();
		System.out.println(smurfette.getHatColor());
		System.out.println(smurfette.isGirlOrBoy());
		
	}
	
}
