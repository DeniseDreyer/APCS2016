/**
 * 
 */

/**
 * @author dreyerd
 *
 */
public class DoMath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(5, 4));
		System.out.println(Calculate.average(5,4,3));
		System.out.println(Calculate.toDegrees(1.57));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(1,-2, 5));
		System.out.println(Calculate.toImproperFrac(5, 1,3));
		System.out.println(Calculate.toMixedNum(5,3));
		System.out.println(Calculate.foil(5, 1,3, -4, "x"));

		
	}

}
