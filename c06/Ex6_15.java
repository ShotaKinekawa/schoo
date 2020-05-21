import java.util.Scanner;
import java.util.Random;

class Ex6_15{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] weekEnStr = {
			"monday", "tuesday", "wednesday", "thursday",
			"friday", "saturday", "sunday",
		};
		String[] weekJpStr = {
			"月", "火", "水", "木", "金", "土", "日",
		};
		
		int retry = 0; //リトライのフラグ,0:終わる,1:継続
		int former = 13; //前回の正解曜日
		int week;//当てるべき曜日:0~6
		
		System.out.println("英語の曜日名を小文字で入力してください。");
				
		do{
			week = rand.nextInt(7);
			if (former == week){
				continue; //同一曜日なら、選びなおし
			}
			
			while(true){
				System.out.print( weekJpStr[week] + "曜日：");
				String w = stdIn.next();
				
				if(w.equals(weekEnStr[week])){
					break;
				}
				System.out.println("違います");
			}
			
			
			System.out.print("正解です。もう一度？ 1...Yes / 0...No:");
			retry = stdIn.nextInt();
			former = week;
		}while(retry == 1);
	}
}
