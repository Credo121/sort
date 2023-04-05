package Mergesort;

public class Main {

    public static void main(String[] args) {
        int [] result = Separation.sortArray(new int[]{5, 3, 8, 1, 9, 100, 35, 64, 1, 86, 0});

        for (int i = 0; i < result.length ; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
