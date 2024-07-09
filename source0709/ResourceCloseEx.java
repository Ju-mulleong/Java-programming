package source0709;
import java.io.FileInputStream;
import java.io.IOException;

public class ResourceCloseEx {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("file.txt");
        } catch(IOException e) {
            //예외 처리
        }finally {
            try {
                fis.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
