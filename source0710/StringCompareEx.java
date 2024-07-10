package source0710;

public class StringCompareEx {

    public static void compareString(String s1, String s2) {
        int res = s1.compareTo(s2);

        System.out.println("res: " + res);
        if(res == 0)
            System.out.println("the same");
        else if(res < 0)
            System.out.println(s1 + " < " + s2);
        else
            System.out.println(s1 + " > " + s2);
    }

    public static void main(String[] args) {
        String str1 = "C++";
        String str2 = "Java";
        compareString(str1, str2);
        // ASCII Code에서 'C' : 67, 'J' : 74 이다. (67-74 = -7)

        compareString("java", "Java");
    }
}
