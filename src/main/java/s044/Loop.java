package s044;

public class Loop {
	public static void main(String[] args) {
		int[] data = { 5, 7, 1, 3, 4 };

		// for

		System.out.print('[');
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
			if (i < data.length - 1) {
				System.out.print(",");
			}
		}

		System.out.print(']');

		// while

		System.out.print('[');

		int i = 0;
		while (i < data.length) {
			System.out.print(data[i]);
			if (i<data.length-1) {
				System.out.print(",");
			}
			i += 1; //oppure ++i;, oppure i=i+1;
		}

		System.out.print(']');

		// for each
		System.out.print('[');
		for (int item : data) {
			System.out.print(item);
		}
		System.out.print(']');
	}
}
