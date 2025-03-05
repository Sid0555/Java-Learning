package stringQuestion;

public class Replace_special__char {
	public static void main(String[] args) {
		String str = "$J!AV@A*U";
		String plainstr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainstr);
	}

}
