import java.util.Random;

public class Id {

	static int counter;	//‰½”Ô‚Ü‚Å‚Ì¯•Ê”Ô†‚ğ—^‚¦‚½‚©
						//ID‘S‘Ì‹¤—L
	
	private int id; 		//¯•Ê”Ô†
	
	static {
		Random random = new Random();
		counter = random.nextInt(10) * 100;
	}
	
	public Id(){
		id = ++counter;		//¯•Ê”Ô†‚Ì•t—^
	}
	
	public int getID(){
		return id;
	}
	
	static int getMaxId(){
		return counter;
	}

}
