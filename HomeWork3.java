import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
        makeMassive();    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
                          // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
                          // С помощью цикла и условия заменить 0 на 1, 1 на 0
        System.out.println();
        System.out.println("================================");
        makeMassive100(); //Задать пустой целочисленный массив длиной 100.
                          // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        System.out.println();
        System.out.println("================================");
        makeMassiveRandom(); //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
                             // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println();
        System.out.println("================================");
        makeSquare(); // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
                     // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
                     // (можно только одну из диагоналей, если обе сложно).
                     // Определить элементы одной из диагоналей можно по следующему принципу:
                     // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        System.out.println();
        System.out.println("================================");
        System.out.println(lenValue(10,955558678));
        //Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len,
        // каждая ячейка которого равна initialValue;
    }
    public static int [] lenValue(int len,int initialValue) {
        int firstArr [] = new int [len];
        for (int i = 0; i< firstArr.length; i++) {
            firstArr[i] = initialValue;
            System.out.println(firstArr[i]);
        }
        return new int[]{firstArr.length};
    }

    private static void makeSquare() {
        int n = 4;
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            table[i][i] = 1;
            table[i][n - i - 1] = 1;
            for (int j = 0; j < n; j++){
                System.out.print(table[i][j] + " ");
        }
        System.out.println();
    }
    }

    private static void makeMassiveRandom(){
            int[] massiveRandom = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            int maxMassiveRandom = massiveRandom.length;
            for (int i=0; i<maxMassiveRandom; i++)
                System.out.print(massiveRandom[i] + " ");
        System.out.println();
            for (int i=0; i<maxMassiveRandom; i++)
                if (massiveRandom[i] < 6) massiveRandom[i] = massiveRandom[i] * 2;
            for (int i=0; i<maxMassiveRandom; i++) {
                System.out.print(massiveRandom[i] + " ");
            }

    }
    private static void makeMassive100() {
            int[] massive100 = new int[101];
            int maxMassive100 = massive100.length;
            for (int i=0; i<maxMassive100; i++)
                System.out.print(i + " ");
    }

    private static void makeMassive(){
            int[] massive = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
            int maxMassive = massive.length;
            for (int i = 0; i < maxMassive; i++){
                System.out.print (massive[i]+" ");
            }
                System.out.println("");
            for (int i = 0; i < maxMassive; i++)
                if(massive[i] == 1) {
                    massive[i] = 0;
                }else massive[i] = 1;
            for(int i = 0; i < maxMassive; i++){
                System.out.print (massive[i]+" ");
            }

    }

}
