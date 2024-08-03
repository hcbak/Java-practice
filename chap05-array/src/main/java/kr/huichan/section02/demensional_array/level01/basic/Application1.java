package main.java.kr.huichan.section02.demensional_array.level01.basic;

public class Application1 {
    public static void main(String[] args) {
        int[][] myArray = new int[3][4];
        int count = 1;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                myArray[i][j] = count++;
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                System.out.print(String.format("%3s", myArray[i][j]));
            }
            System.out.println();
        }
    }
}
