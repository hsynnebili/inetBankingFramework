package Collections;

public class ArrayConcepts {

	public static void main(String[] args) {

		// 1.int array
		int[] i = new int[4];

		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[0]);
		System.out.println(i[2]);
		System.out.println(i.length);
		// System.out.println(i[4]);ArrayIndexOutOfBoundsException

		System.out.println("================");

		// print all the values of array :use for loop
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		System.out.println("====double array=======");
		// 2.double array

		double[] d = new double[5];
		d[0] = 12.12;
		d[1] = 0.15;
		d[2] = 15.12;
		d[3] = 2.75;
		d[4] = 0.45;

		System.out.println(d.length);

		for (int j = 0; j < d.length; j++) {
			System.out.println(d[j]);
		}
		// Object array(object is class)

		System.out.println("======Object Array========");
		Object[] obj = new Object[4];
		obj[0] = "Hello";
		obj[1] = 10;
		obj[2] = 12.25;
		obj[3] = 'A';

		System.out.println(obj.length);
		System.out.println(obj[2]);

		for (int j = 0; j < obj.length; j++) {
			System.out.println(obj[j]);
		}

	}

}
