import java.util.Scanner;

class Ex08_01{
	
	static Scanner stdIn = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int num;
		do{
			System.out.print("何人のデータを作成しますか?:");
			num = stdIn.nextInt();
		}while(num < 0);
		
		Human[] humans = new Human[num];
		
		for(int i = 0; i < num; i++){
			System.out.println((i + 1) + "人目");
			System.out.print("名前:");
			String name = stdIn.next();
			System.out.print("身長[cm]:");
			double height = stdIn.nextDouble();
			System.out.print("体重[kg]:");
			double weight = stdIn.nextDouble();
			
			humans[i] = new Human(name, height, weight);
		}
		
		while(true){
			
			System.out.println("==メニュー==");
			System.out.println("1...閲覧 / 2...更新 / 3...終了");
			System.out.print("入力:");
			int read = stdIn.nextInt();
			
			if(read == 3){
				break;
			}else if(read == 1){
				while(true){
					do{
						System.out.print("\n何人目のデータを閲覧しますか?:");
						read = stdIn.nextInt() - 1;
					}while(read < 0 || read >= num);
					
					humans[read].printData();
					
					int retry = 1;
					do{
						System.out.print("\nもう一度？Yes...1/No...0 :");
						retry = stdIn.nextInt();
					}while(retry != 0 && retry != 1);
					
					if(retry == 0){
						System.out.println("メニューに戻ります。");
						System.out.println();
						break;
					}
				}
			}else if(read == 2){
				do{
					System.out.print("何人目のデータを更新しますか?:");
					read = stdIn.nextInt() - 1;
				}while(read < 0 || read >= num);
				
				System.out.println( (read + 1)  + "人目:"+
					humans[read].getName() +"さんのデータを更新します。");
				System.out.print("身長[cm]:");
				double height = stdIn.nextDouble();
				System.out.print("体重[kg]:");
				double weight = stdIn.nextDouble();
				
				humans[read].resetData(height, weight);
				
				System.out.println("更新完了しました。メニューに戻ります。");
				System.out.println();
			}
		}
		
		
	}
	
}
