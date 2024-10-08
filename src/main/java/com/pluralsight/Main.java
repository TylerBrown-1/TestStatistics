package com.pluralsight;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
                // Step 1: Create an array of 10 test scores
                int[] testScores = {85, 92, 76, 81, 95, 88, 79, 84, 91, 87};

                // Step 2: Calculate and display statistics
                double average = calculateAverage(testScores);
                int highScore = findHighScore(testScores);
                int lowScore = findLowScore(testScores);
                double median = calculateMedian(testScores);

                // Step 3: Print results
                System.out.println("Average: " + average);
                System.out.println("High Score: " + highScore);
                System.out.println("Low Score: " + lowScore);
                System.out.println("Median: " + median);
                System.out.println("Difference between Average and Median: " + Math.abs(average - median));
            }

            // Method to calculate average
            public static double calculateAverage(int[] scores) {
                int sum = 0;
                for (int score : scores) {
                    sum += score;
                }
                return (double) sum / scores.length;
            }

    // Method to find high score
    public static int findHighScore(int[] scores) {
        int high = scores[0];
        for (int score : scores) {
            if (score > high) {
                high = score;
            }
        }
        return high;
    }

    // Method to find low score
    public static int findLowScore(int[] scores) {
        int low = scores[0];
        for (int score : scores) {
            if (score < low) {
                low = score;
            }
        }
        return low;
    }

    // Method to calculate median
    public static double calculateMedian(int[] scores) {
        Arrays.sort(scores);
        int middle = scores.length / 2;
        if (scores.length % 2 == 0) {
            return (scores[middle - 1] + scores[middle]) / 2.0;
        } else {
            return scores[middle];
        }
    }
}