package Exercise1.question1a;

public class Question1a {
	public static void main(String[] args) {

		int[] numbers = { -1, 1, 3, 5, -5, -8,-20,-3,10,20 };
		int maxValue = getMaxValue(numbers);
		int minValue = getMinValue(numbers);

		System.out.println("Max Value: " + maxValue);
		System.out.println("Min Value: " + minValue);
	}

	public static int getMaxValue(int[] numbers) {
		int maxValue = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (maxValue < numbers[i] ) {
				maxValue = numbers[i];
			}
		}
		return maxValue;
	}

	public static int getMinValue(int[] numbers) {
		int minValue = numbers[0];
		for (int i = 1; i < numbers.length ; i++) {
			if ( minValue > numbers[i]) {
				minValue = numbers[i];
			}
		}
		return minValue;
	}
}
