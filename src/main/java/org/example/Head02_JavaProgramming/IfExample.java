package org.example.Head02_JavaProgramming;

public class IfExample {
    public static void main(String[] args) {
            int score=65;
            if(score >= 90){
                System.out.println("A학점");
            }else if(score >= 80){
                System.out.println("B학점");
            }else{
                System.out.println("C 이하");
            }


            int age =20;
            boolean isStudent = true;
            if(age >=18){
                if(isStudent){
                    System.out.println("성인");
                }
            }

    }
}
