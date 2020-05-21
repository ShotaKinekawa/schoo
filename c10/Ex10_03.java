import java.util.Scanner;
import java.util.Random;

public class Ex10_03{
	
	static void putAry(int[] a, String str){//�z��{��, �z��
		for(int i = 0; i < a.length; i++){
			System.out.println(str +"[" + i +"] : " + a[i]);
		}
		System.out.println();
	}
	
	static void putAry(double[] a, String str){//�z��{��, �z��
		for(int i = 0; i < a.length; i++){
			System.out.println(str +"[" + i +"] : " + a[i]);
		}
		System.out.println();
	}
	
	static void putAry(long[] a, String str){//�z��{��, �z��
		for(int i = 0; i < a.length; i++){
			System.out.println(str +"[" + i +"] : " + a[i]);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args){
		Random rand = new Random();
		
		int a = rand.nextInt(1001) - 500; //-500�`500�̗���
		int b = rand.nextInt(1001) - 500;
		int c = rand.nextInt(1001) - 500;

		int idxN = rand.nextInt(15) + 5;//5 ~ 20�̗���
		int[] d = new int[idxN];
		for(int i = 0; i < idxN; i++){
			d[i] = rand.nextInt(1001) - 500;
		}
		
		System.out.println("int�^");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		
		
		System.out.println("a,b�̍ő�l�F" + MinMax.max(a, b));
		System.out.println("a,c�̍ŏ��l�F" + MinMax.min(a, c));
		System.out.println("a,b,c�̍ő�l�F" + MinMax.max(a, b, c));
		System.out.println("a,b,c�̍ŏ��l�F" + MinMax.min(a, b, c));
		System.out.println();
		
		putAry(d, "d");
		System.out.println("d�̍ő�l�F" + MinMax.max(d));
		System.out.println("d�̍ŏ��l�F" + MinMax.min(d));
		
		System.out.print("\n-----------------------\n");
		
		double e = rand.nextDouble(); 
		double f = rand.nextDouble();
		double g = rand.nextDouble();

		idxN = rand.nextInt(15) + 5;//5 ~ 20�̗���
		double[] h = new double[idxN];
		for(int i = 0; i < idxN; i++){
			h[i] = rand.nextDouble();
		}
		
		System.out.println("double�^");
		System.out.println("e:" + e);
		System.out.println("f:" + f);
		System.out.println("g:" + g);
		
		
		System.out.println("e,f�̍ő�l�F" + MinMax.max(e, f));
		System.out.println("f,g�̍ŏ��l�F" + MinMax.min(f, g));
		System.out.println("e,f,g�̍ő�l�F" + MinMax.max(e, f, g));
		System.out.println("e,f,g�̍ŏ��l�F" + MinMax.min(e, f, g));
		System.out.println();
		
		putAry(h, "h");
		System.out.println("h�̍ő�l�F" + MinMax.max(h));
		System.out.println("h�̍ŏ��l�F" + MinMax.min(h));
		
		System.out.print("\n-----------------------\n");
		
		long x = rand.nextLong(); //-500�`500�̗���
		long y = rand.nextLong();
		long z = rand.nextLong();

		idxN = rand.nextInt(15) + 5;//5 ~ 20�̗���
		long[] w = new long[idxN];
		for(int i = 0; i < idxN; i++){
			w[i] = rand.nextLong();
		}
		
		System.out.println("long�^");
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		System.out.println("z:" + z);
		
		
		System.out.println("y,z�̍ő�l�F" + MinMax.max(y, z));
		System.out.println("x,z�̍ŏ��l�F" + MinMax.min(x, z));
		System.out.println("x,y,z�̍ő�l�F" + MinMax.max(x, y, z));
		System.out.println("x,y,z�̍ŏ��l�F" + MinMax.min(x, y, z));
		System.out.println();
		
		putAry(w, "w");
		System.out.println("w�̍ő�l�F" + MinMax.max(w));
		System.out.println("w�̍ŏ��l�F" + MinMax.min(w));
	}
	
}
