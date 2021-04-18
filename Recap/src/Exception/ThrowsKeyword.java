package Exception;

public class ThrowsKeyword {

	public static void main(String[] args) throws ArithmeticException {

		ThrowsKeyword obj = new ThrowsKeyword();
		try {
			obj.sum();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
	}

	public void sum() throws ArithmeticException {
		div();
	}

	public void div() throws ArithmeticException {
		int i = 9 / 0;

	}

}
