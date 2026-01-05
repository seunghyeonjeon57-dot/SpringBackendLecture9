package org.example.Head02_JavaProgramming;

public class SumCalculator {
    public static void main(String[] args) {
        int[] inputs ={10,20,30,0};
        int inputIndex = 0;
        int sum=0;

        while(inputIndex<inputs.length){
            int currentInput = inputs[inputIndex];

            if(currentInput == 0){
                break;


            }
            sum+=currentInput;
            inputIndex++;
        }
        System.out.println("결과 합계: " + sum);
    }
}
