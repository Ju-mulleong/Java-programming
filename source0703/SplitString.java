package source0703;

public class SplitString {

	public static void main(String[] args) {
		String str3 = "source0628.Hello,world;Java Programming";
		String[] splited3 = str3.split(",|;| "); // "," or(|) ";" or(|) 공백(" ") 기준
		
		for(int i = 0; i<splited3.length; i++)
			System.out.printf("[%d]: %s\n", i, splited3[i]);

	}

}
