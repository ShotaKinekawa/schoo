import java.util.Scanner;

class Ex08_02{
	
	static Scanner stdIn = new Scanner(System.in);
	
	public static void main(String[] args){
		
		System.out.println("車のデータを入力してください。");
		
		System.out.print("名前:");
		String name = stdIn.nextLine();
		int number;
		do{
			System.out.print("車のナンバー(4桁):");
			number = stdIn.nextInt();
		}while(number< 1000 || number > 9999);
		System.out.print("車幅[mm]:");
		int width = stdIn.nextInt();
		System.out.print("高さ[mm]:");
		int height = stdIn.nextInt();
		System.out.print("長さ[mm]:");
		int length = stdIn.nextInt();
		System.out.print("タンク容量[L]:");
		double capacity = stdIn.nextDouble();
		System.out.print("燃費[km/L]:");
		double efficiency = stdIn.nextDouble();
		
		Car myCar = new Car(name, number, width, height, length, capacity, efficiency);
		
		
		while(true){
			
			myCar.putSituation();
			
			System.out.println("==メニュー==");
			System.out.println("1...スペック閲覧 / 2...移動 / 3...給油 / 4...終了");
			System.out.print("入力:");
			int read = stdIn.nextInt();
			
			if(read == 4){
				break;
			}else if(read == 3){
				System.out.print("何L給油しますか？：");
				double a = stdIn.nextDouble();
				myCar.refill(a);
			}else if (read == 2){
				System.out.print("X方向の移動距離[km]：");
				double dx = stdIn.nextDouble();
				System.out.print("Y方向の移動距離[km]：");
				double dy = stdIn.nextDouble();
				
				if(!myCar.move(dx, dy)){
					System.out.println("燃料が足りません！");
				}
			}else if(read == 1){
				myCar.putSpec();
			}
		}
		
		
	}
	
}
