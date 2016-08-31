/**
 * 
 */

/**
 * @author dreyerd
 *
 */
public class Calculate {

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
}
