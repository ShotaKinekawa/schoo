import java.util.Random;

public class Id {

	static int counter;	//何番までの識別番号を与えたか
						//ID全体共有
	
	private int id; 		//識別番号
	
	static {
		Random random = new Random();
		counter = random.nextInt(10) * 100;
	}
	
	public Id(){
		id = ++counter;		//識別番号の付与
	}
	
	public int getID(){
		return id;
	}
	
	static int getMaxId(){
		return counter;
	}

}
