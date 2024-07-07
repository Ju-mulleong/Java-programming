/**
 * Lab 3. 순차 탐색
 * - 랜덤하게 생성한 배열에서 특정 숫자를 검사하는 프로그램 
 * - 2개의 랜덤 배열 생성 및 서로 비교  
 */

package lab03;

import java.util.Arrays;

public class SolSequentialSearch {
	static final int ARRAY_SIZE = 6;
	
	/**
	 * 두 배열의 값을 비교하여 일치하는 값에는 'O' 출력, 일치하지 않는 값에는 'X' 출력 
	 * @param array1: 원본 배열 
	 * @param array2: 비교할 배열 
	 */
	public static void compareArray(int lottoArray[], int winningArray[]) {
		char[] matchedNumber = new char[ARRAY_SIZE];
		
		for(int i=0; i < ARRAY_SIZE; i++) {
			for(int j=0; j < ARRAY_SIZE; j++) {
				if(winningArray[i] == lottoArray[j]) {
					matchedNumber[j] = 'O';
				}
				else if(matchedNumber[j] == 'O')	// 중복된 번호: 이미 확인된 번호는 건너띔 
					continue;						// 안해도 돌아가긴 할듯? 좀 더 효율적으로 쓸려고한듯
				else
					matchedNumber[j] = 'X';
			}
		}
		
		System.out.print("당첨 결과     : ");		
		for(int i=0; i < ARRAY_SIZE; i++) {
			System.out.printf("%3d ", lottoArray[i]);		
		}
		System.out.println();
		System.out.print("                ");

		for(int i=0; i < ARRAY_SIZE; i++) {		
			System.out.printf("%3c " , matchedNumber[i]);
		}
		
		System.out.println();
		System.out.println("----------------------------------------");

	}
	
	/**
	 * 1차원 배열의 내용을 자리 맞춤하여 출력하는 함수 
	 * @param array
	 */
	public static void printArray(int array[]) {
		
		for(int i=0; i<array.length; i++) {
			System.out.printf("%3d " , array[i]);
		}
		System.out.println();
		System.out.println("----------------------------------------");
		
	}

	public static void main(String[] args) {
		int[] winningArray = new int[ARRAY_SIZE];	// 당첨 번호 저장 배열 
		int[] randomArray = new int[ARRAY_SIZE]; 	// 사용자 랜덤 로또 번호 저장 배열

		for(int i=0; i<ARRAY_SIZE; i++) {
			randomArray[i] = (int)(Math.random() * 45) + 1;
			winningArray[i] = (int)(Math.random() * 45) + 1;
		}
		
//		int[] randomArray =  {9, 23, 23, 25, 30, 43}; 
//		int[] winningArray = {8, 13, 23, 30, 30, 40};
		
		
		Arrays.sort(randomArray);	// 오름차순 정렬 
		Arrays.sort(winningArray);	// 오름차순 정렬 
		
		
		System.out.println("----------------------------------------");
		
		System.out.print("자동 생성 번호: ");
		printArray(randomArray);
		
		System.out.print("당첨 번호     : ");
		printArray(winningArray);
		
		compareArray(randomArray, winningArray);
	}

}
