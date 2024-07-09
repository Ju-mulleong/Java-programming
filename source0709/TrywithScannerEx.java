package source0709;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrywithScannerEx {

    /**
     * Scanner 객체를 이요한 파일 읽기
     *  - Scanner.close()가 자동 호출됨
     */
    public static void fileReadScanner() {
        File file = new File("alphabet.txt");

        try(Scanner scanner = new Scanner(file)) {
            while(scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void consoleReadScanner() {
        String input = "";
        System.out.println();

        try(Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.print("Input String");
                input = scanner.nextLine();
                System.out.println("Typed String: " + input);
            }while(!input.equals("q"));
        }catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Exit Program!");
    }

    public static void main(String[] args) {
        fileReadScanner();
        consoleReadScanner();
    }
}
