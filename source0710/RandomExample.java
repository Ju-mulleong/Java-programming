package source0710;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        //선택번호
        int[] selectNumber = new int[6];

        Random random = new Random(3); //시드값 고정- 매번 동일한 랜덤값 생성
        System.out.print("선택번호: ");
        for(int i = 0; i<6; i++) {
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.print(selectNumber[i] + " ");
        }

        System.out.println();

        //당첨번호
        int[] winningNumber = new int[6];
        random = new Random();
        System.out.print("당첨번호: ");
        for (int i = 0; i < 6; i++) {
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.print(winningNumber[i] + " ");

        }
        System.out.println();

        //당첨여부
        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);

        boolean result = Arrays.equals(selectNumber, winningNumber);
        System.out.print("당첨여부: ");

        if(result) {
            System.out.println("1등에 당첨되셨습니다.");
        }else {
            System.out.println("당첨되지 않았습니다.");
        }
    }
}
