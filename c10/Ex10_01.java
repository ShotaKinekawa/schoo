class ID{
	static int counter = 0;	//何番までの識別番号を与えたか
							//ID全体共有
	
	private int id; 		//識別番号
	
	public ID(){
		id = ++counter;		//識別番号の付与
	}
	
	public int getID(){
		return id;
	}
	
	static int getMaxId(){
		return counter;
	}
}

public class Ex10_01{
	
	public static void main(String[] args){
		ID a = new ID();
		ID b = new ID();
		
		System.out.println("aの識別番号：" + a.getID());
		System.out.println("bの識別番号：" + b.getID());
		
		System.out.println("ID.counter = " + ID.counter);
		System.out.println("a.counter = " + a.counter);
		System.out.println("b.counter = " + b.counter);
		
		System.out.println("ID.getMaxId() = " + ID.getMaxId());
	}
	
}
