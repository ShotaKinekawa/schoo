import java.util.Scanner;
import java.util.Random;

class Ex6_14{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] monthStr = {
			"January", "February", "March", "April", 
			"May", "June", "July", "August",
			"September", "October", "November","December",
		};
		
		int retry = 0; //リトライのフラグ
		int former = 13; //前回の正解月
		int month;//当てるべき月:0~11
		
		System.out.print("英語の月名を入力してください。 \nなお、先頭は大文字で、2文字目以降は小文字とします。\n");
				
		do{
			month = rand.nextInt(12); //当てるべき月:0~11
			if (former == month){
				continue; //同一月なら、選びなおし
			}
			
			while(true){
				System.out.print( (month + 1)+ "月：");
				String m = stdIn.next();
				
				if(m.equals(monthStr[month])){
					break;
				}
				System.out.println("違います");
			}
			
			System.out.print("正解です。もう一度？ 1...Yes / 0...No:");
			retry = stdIn.nextInt();
			former = month;
		}while(retry == 1);
	}
}
