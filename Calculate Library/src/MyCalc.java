/**
 * 
 */

/**
 * @author dreyerd
 *
 */
public class MyCalc {

	public static int square(int number){
		return(number*number);
	}
	public static int cube(int number){
		return(number*number*number);
	}
	public static double average(double num1, double num2){
		return((num1 + num2)/2);
	}
	public static double average(double num1, double num2, double num3){
		return((num1 + num2+ num3)/3);
	}
	public static double toDegrees(double radianAngle){
		return(radianAngle*180/3.14159);
	}
	public static double toRadians(double degreeAngle){
		return(degreeAngle*3.14159/180);
	}
	public static double discriminant(double a, double b, double c){
		return(b*b - 4*a*c);
	}
	public static String toImproperFrac(int wholenum, int numerator, int denominator){
		return(denominator*wholenum + numerator + "/" +denominator );
	}
	public static String toMixedNum (int numerator, int denominator){
		return( numerator/denominator + "_" + numerator%denominator+"/"+denominator);
	}
	public static String foil( int a, int b, int c, int d, String variable){
		return (a*c+variable+"^2"+(b*c+a*d)+variable + b*d);
	}
	public static boolean isDivisibleBy(int num1, int num2){
		return (num1%num2 == 0);
	}
	public static double absValue(double number){
		if (number >= 0) {
			return (number);
		}
		else 
			return (-1*number);
	}
	public static int max(int num1, int num2){
		if (num1 > num2){
			return num1;
		}
		else {
			return num2;
		}
	}
	public static double max(double num1, double num2, double num3){
		double maxnum = num1;
		if (num2 > maxnum){
			maxnum = num2;
		}
		if (num3 > maxnum){
			maxnum = num3;
		}
		return maxnum;
	}
	public static int min(int num1, int num2){
		if (num1 < num2){
			return num1;
		}
		else {
			return num2;
		}
	}
	public static double round2(double number){
		double answer;
		int tempAnswer;
		tempAnswer = (int) (100*(0.005+number));
		answer = tempAnswer/100.0;
		return (answer);
	}
	public static double exponent(double base, int expo){
		double result = 1.0;
		for (int i=1; i<= expo; i++){
			result = result*base;
		}
		return result;
	}
	public static int factorial(int startNum){
		int result=1;
		for(int i = startNum; i > 1; i--){
			result = result*i;
		}
		return result;
	}
	public static boolean isPrime(int number){
		
		for (int i = number; i > 1; i --){
			if (isDivisibleBy(number, i-1)){
				System.out.println(i);
				return true;
			}
		}
		return false;
	}
}
