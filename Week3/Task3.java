package Week3;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        
    
        // Write a JAVA program to find the maximum between three numbers.
        int num1 =10, num2 =20, num3=40;
        if (num1>num2 && num1>num3){
            System.out.println("num1 is the greatest");
        }else if(num2>num1 && num2> num3){
            System.out.println("Num2 is the greatest");
        }else{
            System.out.println("Num3 is the greatest");
        } 
        
        //Write a JAVA program to check whether a number is negative, positive, or zero
        int num4 =34;
        if(num4 > 0){
            System.out.println("Number is positive");
        }else if(num4 < 0){
            System.out.println("Number is negative");

        }else if(num4 == 0){
            System.out.println("Number is zero");

        }
        //Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
        int num5 = 10;
        if(num5 % 5 ==0 && num5 % 11 ==0 ){
            System.out.println("number is divisible by 5 and 11");
        }else{
            System.out.println("number is not divisible by 5 and 11");
        }
        // Write a JAVA program to check whether a number is even or odd.
        int num6 = 10;
        if(num6 %2 ==0){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
        }
        //Write a JAVA program to check whether a year is a leap year or not. 
        int year = 2000;
        if ((year%4==0 && year%100!=0) || ( year%400==0)){
            System.out.println("the given year is leap year");
        }else{
            System.out.println("the given year is not leap year");
        }
        //Write a JAVA program to input any alphabet and check whether it is vowel or consonant
        char ch='A';
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
                default:
                    System.out.println("Consonant");
                
               
        }
        //Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. Use a switch case statement to handle different grades.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the student's grade (A, B, C, D, or F):");
        char grade = scanner.next().toUpperCase().charAt(0);

        double gpa = 0.0;

        switch (grade) {
            case 'A':
                gpa = 4.0;
                break;
            case 'B':
                gpa = 3.0;
                break;
            case 'C':
                gpa = 2.0;
                break;
            case 'D':
                gpa = 1.0;
                break;
            case 'F':
                gpa = 0.0;
                break;
            default:
                System.out.println("Invalid grade entered.");
                return;
        }

        System.out.println("The GPA value for grade " + grade + " is: " + gpa);

        scanner.close();
        //Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and performs the corresponding arithmetic operation using a switch case statement.
       // in file named Arthimetic.java
       
    }

}
    

