/*
* AIM:- Write a program to perform arithmetic and bitwise operations in a single source program without object creation
* */
public class Practical2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int additionResult = a + b;
        int subtractionResult = a - b;
        int multiplicationResult = a * b;
        double divisionResult = (double) a / b;


        System.out.println("addition: "+additionResult);
        System.out.println("Subtraction: "+subtractionResult);
        System.out.println("Multiplication: "+multiplicationResult);
        System.out.println("Division: "+divisionResult);



        int x = 15;
        int y = 7;
        int bitwiseAndResult = x & y;
        int bitwiseOrResult = x | y;
        int bitwiseXorResult = x ^ y;
        int bitwiseLeftShiftResult = x << 2;
        int bitwiseRightShiftResult = x >> 2;

        System.out.println("BitwiseAnd: "+bitwiseAndResult);
        System.out.println("BitwiseOr: "+bitwiseOrResult);
        System.out.println("BitwiseXorResult: "+bitwiseXorResult);
        System.out.println("BitwiseLeftShift: "+bitwiseLeftShiftResult);
        System.out.println("BitwiseLeftShift:"+ bitwiseRightShiftResult);
    }
}
