import java.util.Scanner;

class Ex4_24{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("�f���ł��邩���肵�܂��B\n���̐����F");
			n = stdIn.nextInt();
		}while(n < 1);
		
		int flg = 1; //�f���Ȃ�1�A�����łȂ����0
		
		if(n > 1){
			for(int i = 2; i * i <= n; i++){
				if(n % i == 0){
					flg = 0;
					break;
				}
			}
		}else{
			flg = 0; //n=1�͑f��
		}
		
		System.out.println(n + "��" + (flg == 1? "�f���ł��B":"�f���ł͂���܂���B"));
	}
}
