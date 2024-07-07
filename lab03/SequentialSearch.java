package lab03;

import java.util.Arrays;

public class SequentialSearch {
	
	
	

	public static void main(String[] args) {
		
		// 번호 저장 배열 선언
		int[] randomArray = new int[6]; //Arraysize로 정의가능
		int[] winningArray = new int[6];

		
		// 6개의 랜덤값 생성 후, 각 배열을 오름 차순 정렬
		
		for(int i = 0; i<randomArray.length; i++) {
			randomArray[i] = (int)(Math.random() * 45) + 1; 
			winningArray[i] = (int)(Math.random() * 45) + 1;
		
		}
		// 각 배열 오름차순 정렬
		Arrays.sort(randomArray);
		Arrays.sort(winningArray);
	}
	
	// 1차원 배열의 각 원소의 값을 자리 수를 맞춰서 출력	
	public static void printArray(int array[]) {
		
		//System.out.print("----------------------------------------")
		
		for(int i = 0; i< array.length;i ++ ) // printArray에서는 array[]가 매개변수
		System.out.print(false);
		
	}

}


/*
 * 자리 상관없이 비교, 실제복권과 다름
 * 
 */

