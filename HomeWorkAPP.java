public class HomeWorkAPP {

    public static void main(String[] args) {
        drawSquare();
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }



    private static void drawSquare() {
        System.out.println("-----");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println("-----");
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Apple");
        System.out.println("Banana");

    }
    private static void checkSumSign() {
    int a = 10;
    int b = -20;
    int res = a + b;
        System.out.println(res);
    if (res > 0) {
       System.out.println("Сумма положительная");
    }
    else {
        System.out.println("Сумма отрицательная");
    }
    }
    private static void printColor() {
        int value = 1199;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    private static void compareNumbers() {
        int a = 3;
        int b = 6;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}

