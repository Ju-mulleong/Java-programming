package source0702;

public class DoWhileAscii {

	public static void main(String[] args) {
		char capital = 'A' ;
		char lower = 'a';
		
		System.out.println("ASCII Code Table");
		System.out.println("------------------------------");
		System.out.println("Chr Dec Hex\tChr Dec Hex");
		System.out.println("------------------------------");
		
		do {
			System.out.printf("%c: %3d, 0x%2x\t", capital, (int)capital, (int)capital);
			System.out.printf("%c: %3d, 0x%2x\n", lower, (int)lower, (int)lower);
			capital = (char)(capital + 1);
			lower = (char)(lower + 1);
		}while(capital <= 'Z' || lower <= 'z');

	}

}
