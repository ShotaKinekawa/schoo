
/**
 * file
 */
import java.util.Scanner;

/**
 * 
 * @author Shota_Kinekawa Date:2020/05/11
 */

class RangeError extends RuntimeException {
	RangeError(int n) {
		super("範囲外の値: " + n);
	}
}

class ParameterRangeError extends RangeError {
	ParameterRangeError(int n) {
		super(n);
	}
}

class ResultRangeError extends RangeError {
	ResultRangeError(int n) {
		super(n);
	}
}

public class Ex16_02 {

	static boolean isValid(int n) {
		return n >= 0 && n <= 9;
	}

	static int add(int a, int b) throws ParameterRangeError, ResultRangeError {
		if (!isValid(a))
			throw new ParameterRangeError(a);
		if (!isValid(b))
			throw new ParameterRangeError(b);
		int result = a + b;
		if (!isValid(result))
			throw new ResultRangeError(result);
		return result;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a :");
		int a = stdIn.nextInt();
		System.out.print("整数b :");
		int b = stdIn.nextInt();

		try {
			System.out.println("それらの和は" + add(a, b) + "です。");
		} catch (RangeError e) {
			if (e instanceof ParameterRangeError) {
				System.out.println("加える数が範囲外です。" +((ParameterRangeError)e).getMessage());
				;
				
			}else if (e instanceof ResultRangeError) {
				System.out.println(" 計算結果が範囲外です。" + ((ResultRangeError) e).toString());
			}
		}
		
		stdIn.close();
	}
}
