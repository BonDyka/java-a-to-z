
import java.lang.Math;

public class Calculate {

	private static final String ADD_OPERATOR = "+";
	private static final String SUBT_OPERATOR = "-";
	private static final String MULT_OPERATOR = "*";
	private static final String DIV_OPERATOR = "/";
	private static final String POW_OPERATOR = "^";

	public static void main(String[] args) {
		System.out.println(args);
		System.out.println("Calculate...");
		double first = Double.valueOf(args[0]);
		String operator = args[1];
		double second = Double.valueOf(args[2]);
		if (args.length < 4) {
			System.out.println(executeOperation(first, operator, second));
		} else {
			System.out.println((int) executeOperation(first, operator, second));
		}
	}

	private static double executeOperation(double first, String operator, double second) {
		double result = -1;
		if (operator.equals(ADD_OPERATOR)) {
			result = sum(first, second);
		}
		if (operator.equals(SUBT_OPERATOR)) {
			result = subt(first, second);
		}
		if (operator.equals(MULT_OPERATOR)) {
			result = mult(first, second);
		}
		if (operator.equals(DIV_OPERATOR)) {
			result = div(first, second);
		}
		if (operator.equals(POW_OPERATOR)) {
			result = pow(first, second);
		}
		return result;
	}

	private static double sum(double first, double second) {
		return first + second;
	}

	private static double subt(double first, double second) {
		return first - second;
	}

	private static double mult(double first, double second) {
		return first * second;
	}

	private static double div(double first, double second) {
		return first / second;
	}

	private static double pow(double first, double second) {
		return Math.pow(first, second);
	}
}