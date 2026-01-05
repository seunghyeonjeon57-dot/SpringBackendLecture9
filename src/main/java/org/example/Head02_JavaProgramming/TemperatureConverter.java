package org.example.Head02_JavaProgramming;

public class TemperatureConverter {
    public static void main(String[] args) {
        int celsius=25;
        double fire = (double)celsius * 9/5 +32;
        double kelvin = (double)celsius + 273.15;
        System.out.println("섭씨: " + celsius);
        System.out.println("화씨: " + fire);
        System.out.println("켈빈: " + kelvin);
    }
}
