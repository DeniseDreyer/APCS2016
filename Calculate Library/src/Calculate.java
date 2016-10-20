/**
 * 
 */

/** Program called Calculate used to solve different equations or calculate mathematical values
 * @author APCS1 Antonio Balagot
 * 8/30/16
 */ 
public class Calculate {
	//Part 1
	public static double square(double number) {
		double answer;
		answer = (number * number);
		return answer;
	}
	public static double cube(double number) {
		double answer;
		answer = (number * number * number);
		return answer;
	}
	public static double average(double number1, double number2) {
		double answer;
		answer = (number1 + number2) / 2;
		return answer;
	}
	public static double average(double number1, double number2, double number3) {
		double answer;
		answer = (number1 + number2 + number3) / 2;
		return answer;
	}
	public static double toDegrees(double radius) {
		double answer;
		answer = (radius * 3.14159) / 180;
		return answer;
	}
	public static double toRadians(double degrees) {
		double answer;
		answer = (degrees * 180) / 3.14159;
		return answer;
	}
	public static double discriminant(double a, double b, double c) {
		double answer;
		answer = (b * b) - (4 * a * c);
		return answer;
	}
	public static String toImproperFrac(int wholenum, int numerator, int denominator) {
		String answer;
		answer = ((wholenum * denominator) + numerator + "/"  + denominator);
		return answer;
	}
	public static String toMixedNum(int numerator, int denominator) {
		String answer;
		answer = (numerator/denominator) + "_" + (numerator%denominator) + "/" + denominator;
		return answer;
	}
	public static String foil(int a, int b, int c, int d, String x) {
		String answer;
		answer = (a * c) + "x^2 + " + ((d * a) + (b * c)) + "x + " + (b *d);
		return answer;
	}
	//Part 2
	public static boolean isDivisibleBy(int number1, int number2) {
		if (number1 < number2) {
			throw new IllegalArgumentException("number1 must be greater than number2");
		}
		if(number1 % number2 == 0){;
		return true;
		}else{
			return false;
		}
	}
	public static double absValue(double number) {
		if(number > 0){;
		return number;
		}else{
			return (number * -1);
		}
	}
	public static double max(double number1, double number2) {
		if(number1 > number2){
			return number1;
		}else{
			return number2;
		}
	}
	public static double max(double num1, double num2, double num3) {
		if(num1 > num2 && num1 > num3){
			return num1;
		}else if(num2 > num1 && num2 > num3){
			return num2;
		}else{
			return num3;
		}
	}

	public static double min(double number1, double number2) {
		if(number1 < number2){
			return number1;
		}else{
			return number2;
		}
	}		
	public static double round2(double number) {
		double x=number*1000;
		double y=x%10;
		if (y >=5){
			return (x-y+10)/1000;
		}else{
			return (x - y)/1000;
		}
	}
	//Part 3
	public static double exponent(double base, int exponent) {
		if(exponent < 0){
			throw new IllegalArgumentException("exponent must be greater than or equal to 0");
		}
		double result = 1;
		for(int i = 0; i < exponent; exponent--){
			result *= base;
		}
		return result;
	}
	public static int factorial(int number) {
		if(number < 0) {
			throw new IllegalArgumentException("number must be greater than or equal to 0");
		}
		int product = 1;
		for (int i = 2; i<= number; i++) {
			product = product * i;
		}
		return product;
	}
	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		if (number == 2) {
			return true;
		}
		for(int i = 3; i < number; i++){
			if (Calculate.isDivisibleBy(number, 2)){
				return false;
			}
		}
		return true;
	}
	public static double gcf(double num1, double num2) {
		if(num1 < 0 || num2 < 0) {
			return gcf(Calculate.absValue(num1), Calculate.absValue(num2));
		}if(num2 == 0) {
			return num1;
		} else {
			return gcf(num2, num1 % num2);
		}
	}
	public static double sqrt(double num1) {
		if(num1 < 0) {
			throw new IllegalArgumentException("number must be greater than or equal to 0");
		}
		for(double k = 0.1; k <= num1; k += 0.1){
			double multiply = k * k;
				if (Calculate.absValue(multiply - num1) <= .1){
					return Calculate.round2(k);
				} 
		}
		return num1;
	}
	public static String quadForm(int a, int b, int c) {
		double root1;
		double root2;
		double discriminant = Calculate.discriminant(a, b, c);
		if (discriminant < 0) {
			return ("no real roots");
		}
		if (discriminant == 0) {
			root1= (b * (-1)) / (a * 2);
			root1= Calculate.round2(root1);
			return ("" + root1);
		}
		if (discriminant > 0) {
			root1 = ((b * (-1)) + sqrt(discriminant)) / (2 * a);
			root1 = Calculate.round2(root1);
			root2 = ((b * (-1)) - sqrt(discriminant)) / (2 * a);
			root2 = Calculate.round2(root2);
			double max = Calculate.max(root1, root2);
			double min = Calculate.min(root1, root2);
			return (min + " and " + max);
		}
		return ("");
	}
}