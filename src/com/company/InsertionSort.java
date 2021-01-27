package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class InsertionSort {

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
        write("10.random.keys.InsertionSort.txt", keys);

        // Reads the keys value from the text file
        Scanner s = new Scanner(new File("10.random.keys.InsertionSort.txt"));
        int[] input = new int[length];
        int temp = 0;
        while (s.hasNextInt()){
            input[temp++] = s.nextInt();
        }

        // Start time for Time Complexity
        long startTime = System.nanoTime();

        // Insertion Sort Algorithm
        insertionSort(input);

        // End time for Time Complexity
        long endTime = System.nanoTime();

        System.out.println("\nThe sorted values are:");
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }

        // Stores the result after completing the Merge Sort Algorithm on the array as a text file
        write("output.InsertionSort.10.keys.txt", input);

        // Runtime for Merge Sort Algorithm
        long runtime = endTime - startTime;

        double runtimeInSeconds = (double) runtime / 1_000_000_000;
        System.out.println("\nInsertion Sort Algorithm runtime: " + runtimeInSeconds + " seconds");
    }

    public static void write (String filename, int[] x) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (int i = 0; i < x.length; i++) {
            writer.write(Integer.toString(x[i]));
            writer.newLine();
        }
        writer.flush();
        writer.close();
    }

    public static int[] insertionSort(int[] input) {
        for (int i =1; i < input.length; i++) {
            int key = input[i];
            int j = i - 1;

            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = key;
        }
        return input;
    }
}
