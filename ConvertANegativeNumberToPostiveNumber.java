package Assignments;

public class ConvertANegativeNumberToPostiveNumber {

	public static void main(String[] args) {
		int number=-40;
		int positiveNumber;
		if(number<0) {
			System.out.println("The number is Negative");
			positiveNumber=number*(-1); //(-)*(-)=(+)
			System.out.println("The Converted Positive Number is"+" "+  positiveNumber);
		}

	}

}
