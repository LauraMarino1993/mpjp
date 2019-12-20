package codewarskata;

public class Exstringrepeat {
	public static String repeatStr(final int repeat, final String string) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < repeat; i++) {
			s.append(string);
		}
		return s.toString();
	}

	public static void main(String[] args) {
		String x = repeatStr(7, "ciao");
		System.out.println(x);
	}
}
