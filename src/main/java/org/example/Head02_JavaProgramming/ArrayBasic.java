package org.example.Head02_JavaProgramming;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        for(int i=0; i<arr.length;i++){
            System.out.println("인덱스 " + i+": "+arr[i]);
        }
    }
}
