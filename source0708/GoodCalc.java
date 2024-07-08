package source0708;

public class GoodCalc extends Calculator { 
	// 3개 추상 클래스 상속받았으니 반드시 정의된 abstract 클래스 3개는 무조건 구현해야한다.
	// 안하면 컴파일 에러 발생

	
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for(int i=0; i<a.length; i++)
			sum += a[i];
		return sum / a.length;
	}
	
	public static void main(String[] args) {
		GoodCalc calc = new GoodCalc();
		System.out.println(calc.add(2,3));
		System.out.println(calc.subtract(2,3));
		System.out.println(calc.average(new int[] {1,2,3,4,5}));

	}


}
