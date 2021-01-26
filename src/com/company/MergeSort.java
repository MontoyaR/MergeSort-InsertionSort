package com.company;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) throws IOException {

        Random randomNum = new Random();
        Scanner scanner = new Scanner(System.in);

        // Number of keys
        int length;

        System.out.println("How many randomly generated keys do you want?");
        length = scanner.nextInt();

        // Array to store the values of the randomly generated unsorted keys
        int[] keys = new int[length];

        for (int i = 0; i < length; i++){
            keys[i] = randomNum.nextInt();
            System.out.println(keys[i]);
        }

        // Stores the value of the keys array as an text file
        write("10.keys.MergeSort.txt", keys);

        // Reads the keys value from the text file
        Scanner s = new Scanner(new File("10.keys.MergeSort.txt"));
        int[] input = new int[length];
        int temp = 0;
        while (s.hasNextInt()){
            input[temp++] = s.nextInt();
        }

        // Start time for Time Complexity
        long startTime = System.nanoTime();

        // Merge Sort Algorithm
        mergeSort(input, 0, input.length - 1);

        // End time for Time Complexity
        long endTime = System.nanoTime();

        System.out.println("\nThe sorted values are:");
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }

        // Stores the result after completing the Merge Sort Algorithm on the array as a text file
        write("output.MergeSort.10.keys.txt", input);

        // Runtime for Merge Sort Algorithm
        long runtime = endTime - startTime;

        double runtimeInSeconds = (double) runtime / 1_000_000_000;
        System.out.println("\nMerge Sort Algorithm runtime: " + runtimeInSeconds + " seconds");
    }

    /**
     *
     * @param filename
     * @param x
     * @throws IOException
     */
    public static void write (String filename, int[] x) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (int i = 0; i < x.length; i++) {
            writer.write(Integer.toString(x[i]));
            writer.newLine();
        }
        writer.flush();
        writer.close();
    }

    /**
     *
     * @param input
     * @param start
     * @param end
     */
    public static void mergeSort(int[] input, int start, int end){

        //Breaking Condition for Recursion
        if (start < end) {
            // Always 1+ than the last element
            int mid = (start + end) / 2;

            //Left Array
            mergeSort(input, start, mid);

            //Right Array
            mergeSort(input, mid + 1, end);

            //Merge Both Arrays
            merge(input, start, mid, end);
        }
    }

    /**
     *
     * @param input
     * @param start
     * @param mid
     * @param end
     */
    public static void merge(int[] input, int start, int mid, int end){

        int N1 = mid - start + 1;
        int N2 = end - mid;

        // Temporary Arrays
        int L[] = new int[N1];
        int R[] = new int[N2];

        // Copy data into temporary arrays
        for (int i = 0; i < N1; ++i){
            L[i] = input[start + i];
        }
        for (int j = 0; j < N2; ++j){
            R[j] = input[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = start;

        // Determine if L[] or R[] becomes the current index of input[k]
        while (i < N1 && j < N2){
            if (L[i] <= R[j]){
                input[k] = L[i];
                i++;
            } else {
                input[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < N1) {
            input[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < N2){
            input[k] = R[j];
            j++;
            k++;
        }
    }
}

