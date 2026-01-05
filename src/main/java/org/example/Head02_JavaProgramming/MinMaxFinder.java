package org.example.Head02_JavaProgramming;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] numbers={3,7,2,9,1,5,8};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("최댓값: " + max );
        System.out.println("최솟값: " + min);
    }
}
