package org.example.Head02_JavaProgramming;

public class ScoreAnalyzer {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88};
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = (double) sum / scores.length;

        int up = 0;
        int down = 0;
        for (int score : scores) {
            if (score > average) up++;
            else if (score < average) down++;
        }
        System.out.println("평균: " + average);
        System.out.println("평균보다 높은 점수 개수: " + up);
        System.out.println("평균보다 낮은 점수 개수: " + down);
    }
}