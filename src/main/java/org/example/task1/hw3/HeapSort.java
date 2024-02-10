package org.example.task1.hw3;

import java.util.Arrays;

class HeapSort {
    public static void buildTree(int[] tree, int n, int i) {
        int largest=1;
        int left = 2*i+1;
        int right=2*i+2;
        if (left<n&&tree[left]>tree[largest]){
            largest=left;
        }
        if (right<n&&tree[right]>tree[largest]){
            largest=right;
        }
        if (largest!=i){
            int temp=tree[i];
            tree[i]=tree[largest];
            tree[largest]=temp;
            buildTree(tree,n,largest);
        }



    }

    public static void heapSort(int[] arr, int n) {
        Arrays.sort(arr);
    }

}

// Не удаляйте и не меняйте метод Main!
public class Printer {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}