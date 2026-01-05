package org.example.Head02_JavaProgramming;



public class PrimeFinder {
    public static void main(String[] args) {
        System.out.println("1부터 20까지의 소수:");

        // 1. 1부터 20까지 반복
        for (int i = 1; i <= 20; i++) {
            if (i < 2) continue; // 1은 소수가 아니므로 제외

            boolean isPrime = true;

            // 2. i가 소수인지 판별 (2부터 i의 제곱근까지 나누어 봄)
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false; // 나누어떨어지면 소수가 아님
                    break;
                }
            }

            // 3. 소수라면 출력
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // 줄바꿈으로 마무리
    }
}