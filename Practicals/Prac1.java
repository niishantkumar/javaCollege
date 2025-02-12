package javaCollege.Practicals;

//linear search and binary search

import java.io.*;
import java.util.Arrays;

public class Prac1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // declaration and input of array
        int size;
        System.out.print("Enter size of array : ");
        size = Integer.parseInt(bf.readLine());

        int arr[] = new int[size];
        System.out.println("Load arr :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }

        System.out.println();
        // input of key
        int key;
        System.out.print("Enter key : ");
        key = Integer.parseInt(bf.readLine());

        // creating obj of class Search
        Search ob = new Search();

        // linear search
        ob.linearSearch(arr, key);

        // binary search
        Arrays.sort(arr);
        ob.binarySeach(arr, key);

    }

}

class Search {

    // func for linear search
    void linearSearch(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index : " + i);
                return;// if match found return
            }
        }

        System.out.println("No match for " + key);
    }

    // func for binary search
    void binarySeach(int arr[], int key) {
        int mid;
        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) {
            mid = si + (ei - si) / 2;

            if (arr[mid] == key) {
                System.out.println("Found at index : " + mid);
                return;
            }

            if (arr[mid] < key) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }

        System.out.println("No match for " + key);
    }
}