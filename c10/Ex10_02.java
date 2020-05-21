import java.util.Scanner;

class ExID{
	static int counter = 0;	//何番までの識別番号を与えたか
							//ID全体共有
	static int n = 1;
	
	private int id; 		//識別番号
	
	public ExID(){			//コンストラクタ
		id = n + counter;	//識別番号の付与
		counter += n;
	}
	
	public int getID(){
		return id;
	}
	
	static int getMaxId(){
		return counter;
	}
	
	static int getN(){
		return n;
	}
	
	static void setN(int s){
		if(s < 1){
			System.out.println("不正な値です。変更できません。");
		}else{
			n = s;
			System.out.println( n + "に変更しました。");
		}
	}
}

public class Ex10_02{
	
	public static void main(String[] args){
		int gen;	//インスタンス生成個数
		Scanner stdIn = new Scanner(System.in);
		
		do{
			System.out.print("インスタンスを何個生成しますか？:");
			gen = stdIn.nextInt();
		}while(gen < 1);
		
		ExID[] a = new ExID[gen];
		
		for(int i = 0; i < gen; i++){
			a[i] = new ExID();
		}
		
		System.out.println("ID.getMaxId() = " + ExID.getMaxId());
		
		System.out.print("nを変更します:");
		int n = stdIn.nextInt();
		ExID.setN(n);
		
		do{
			System.out.print("インスタンスをあと何個生成しますか？:");
			gen = stdIn.nextInt();
		}while(gen < 1);
		
		ExID[] b = new ExID[gen];
		
		for(int i = 0; i < gen; i++){
			b[i] = new ExID();
		}
		
		System.out.println("ID.getMaxId() = " + ExID.getMaxId());
	}
	
}
