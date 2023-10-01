package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "teste X";
		s = s.toUpperCase();
		s = s.replace("X", "Y");
		s = s.concat("Z");
		
		System.out.println("".toUpperCase());
		
		String y = s
				.replace("Y", "X")
				.toUpperCase();
		
		System.out.println(y);
	}
}
