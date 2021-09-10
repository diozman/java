import com.sun.org.apache.xpath.internal.objects.XString;

public class HomeWorkAPP2 {
    public static void main(String[] args) {
        System.out.println(between10and20(10,14));
        isPositiveOrNegative(12344);
        System.out.println(isNegative(-346));
        printWord("highs", 1);

    }

    private static boolean between10and20(int x, int y) {
        int sum = x + y;
        return sum >= 10 && sum <= 20;
    }
    private static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
    private static boolean isNegative(int x) {
        return x >=0;
    }

    public static void printWord(String word,int times) {
        for (int i = 1; i < 6; i++) {
            System.out.println(word);
        }
        System.out.println();
    }
    
}




