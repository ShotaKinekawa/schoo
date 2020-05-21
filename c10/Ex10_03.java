import java.util.Scanner;
import java.util.Random;

public class Ex10_03{
	
	static void putAry(int[] a, String str){//配列本体, 配列名
		for(int i = 0; i < a.length; i++){
			System.out.println(str +"[" + i +"] : " + a[i]);
		}
		System.out.println();
	}
	
	static void putAry(double[] a, String str){//配列本体, 配列名
		for(int i = 0; i < a.length; i++){
			System.out.println(str +"[" + i +"] : " + a[i]);
		}
		System.out.println();
	}
	
	static void putAry(long[] a, String str){//配列本体, 配列名
		for(int i = 0; i < a.length; i++){
			System.out.println(str +"[" + i +"] : " + a[i]);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args){
		Random rand = new Random();
		
		int a = rand.nextInt(1001) - 500; //-500～500の乱数
		int b = rand.nextInt(1001) - 500;
		int c = rand.nextInt(1001) - 500;

		int idxN = rand.nextInt(15) + 5;//5 ~ 20の乱数
		int[] d = new int[idxN];
		for(int i = 0; i < idxN; i++){
			d[i] = rand.nextInt(1001) - 500;
		}
		
		System.out.println("int型");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		
		
		System.out.println("a,bの最大値：" + MinMax.max(a, b));
		System.out.println("a,cの最小値：" + MinMax.min(a, c));
		System.out.println("a,b,cの最大値：" + MinMax.max(a, b, c));
		System.out.println("a,b,cの最小値：" + MinMax.min(a, b, c));
		System.out.println();
		
		putAry(d, "d");
		System.out.println("dの最大値：" + MinMax.max(d));
		System.out.println("dの最小値：" + MinMax.min(d));
		
		System.out.print("\n-----------------------\n");
		
		double e = rand.nextDouble(); 
		double f = rand.nextDouble();
		double g = rand.nextDouble();

		idxN = rand.nextInt(15) + 5;//5 ~ 20の乱数
		double[] h = new double[idxN];
		for(int i = 0; i < idxN; i++){
			h[i] = rand.nextDouble();
		}
		
		System.out.println("double型");
		System.out.println("e:" + e);
		System.out.println("f:" + f);
		System.out.println("g:" + g);
		
		
		System.out.println("e,fの最大値：" + MinMax.max(e, f));
		System.out.println("f,gの最小値：" + MinMax.min(f, g));
		System.out.println("e,f,gの最大値：" + MinMax.max(e, f, g));
		System.out.println("e,f,gの最小値：" + MinMax.min(e, f, g));
		System.out.println();
		
		putAry(h, "h");
		System.out.println("hの最大値：" + MinMax.max(h));
		System.out.println("hの最小値：" + MinMax.min(h));
		
		System.out.print("\n-----------------------\n");
		
		long x = rand.nextLong(); //-500～500の乱数
		long y = rand.nextLong();
		long z = rand.nextLong();

		idxN = rand.nextInt(15) + 5;//5 ~ 20の乱数
		long[] w = new long[idxN];
		for(int i = 0; i < idxN; i++){
			w[i] = rand.nextLong();
		}
		
		System.out.println("long型");
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		System.out.println("z:" + z);
		
		
		System.out.println("y,zの最大値：" + MinMax.max(y, z));
		System.out.println("x,zの最小値：" + MinMax.min(x, z));
		System.out.println("x,y,zの最大値：" + MinMax.max(x, y, z));
		System.out.println("x,y,zの最小値：" + MinMax.min(x, y, z));
		System.out.println();
		
		putAry(w, "w");
		System.out.println("wの最大値：" + MinMax.max(w));
		System.out.println("wの最小値：" + MinMax.min(w));
	}
	
}
