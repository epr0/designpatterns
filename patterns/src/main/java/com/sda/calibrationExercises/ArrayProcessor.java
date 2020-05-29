package com.sda.calibrationExercises;

public class ArrayProcessor {

    public static void main(String[] args) {
        int[] array = new int[]{9,3,7,14,2};

        processArray(array);

        sortArray(array);
    }

    public static void processArray(int[] array) {
        int max=array[0];
        int min=array[0];
        int sum=0;

        for(int i=1;i<array.length;i++) {
            if(array[i] > max) {
                max=array[i];
            }

            if(array[i]<min) {
                min=array[i];
            }

            sum=sum+array[i];
        }

        System.out.println("Max:" +max);
        System.out.println("Min:" +min);
        System.out.println("Average:" +sum/array.length);
    }

    public static void sortArray(int[] array) {
        int n = array.length;

        //variable used for swapping 2 values in the array
        int aux;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) { // n-i-1 is an optimization. Also works by using j<n.
                if (array[j] > array[j + 1]) {
                    // Swap the values.
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
    }
}
