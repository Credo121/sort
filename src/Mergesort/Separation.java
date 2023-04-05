package Mergesort;

public class Separation {
    public static int [] sortArray(int[] arrayA){
        if (arrayA == null) {
            return null;
        }
        if (arrayA.length < 2) {
            return arrayA;
        }
        int [] arrayB = new int[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);
        //копирует массив A с 0 позиции по arrayA.length / 2 - 1 в 0 позицию массива B

        int [] arrayC = new int[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);
        //копирует массив A с arrayA.length / 2 позиции по arrayA.length - 1 в 0 позицию массива C

        arrayB = sortArray(arrayB);//при помощи рекурсии делим массив пополам, пока не образуются единичные массивы
        arrayC = sortArray(arrayC);


        return Merge.mergeArray(arrayB, arrayC);//вызываем метод для слияния массивов
    }
}
