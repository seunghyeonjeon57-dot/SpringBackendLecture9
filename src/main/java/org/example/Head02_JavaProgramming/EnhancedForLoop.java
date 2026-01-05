package org.example.Head02_JavaProgramming;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] grade = {85,90,78,92,88};
        for(int grades:grade){
            System.out.println(grades+"점");
        }
    }
}
