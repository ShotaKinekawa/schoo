class Ex2_1{
	public static void main(String[] args){
		int x;
		int y;
		//コンパイル時、以下2行でエラーを吐き、
		//コンパイルが強制終了する
		x = 63.4;//エラー行
		y = 18.9;//エラー行
		
		System.out.println("xの値は"+x+"です。");
		System.out.println("yの値は"+y+"です。");
		
		System.out.println("合計は"+(x+y)+"です。");
		System.out.println("平均は"+(x+y)/2+"です。");
	}
}
