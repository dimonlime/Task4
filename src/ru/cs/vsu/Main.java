package ru.cs.vsu;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {5, 8, 1};
        Object[] arr2 = new Object[] {"green", "blue", "red"};
        InsertSort.sort(arr2, arr);
        InsertSort.display(arr2, arr);
    }
}

class InsertSort {
    public static <T> void sort(T[] data, int[] orderValues) {
        for (int i = 1; i < orderValues.length; i++) {
            int curr = orderValues[i];
            T current = data[i];
            int j = i;
            while (j > 0 && orderValues[j - 1] > curr) {
                orderValues[j] = orderValues[j - 1];
                data[j] = data[j - 1];
                j--;
            }
            orderValues[j] = curr;
            data[j] = current;
        }
    }

    public static  <T> void display(T[] data, int [] orderValues) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < orderValues.length; i++) {
            System.out.print(orderValues[i] + " ");
        }
    }
}
