import java.util.Scanner;

//Exception handling in java
//The error implies a problem that mostly arises due to the shortage of system resources.
//On the other hand, the exceptions occur during runtime and compile time.

//1. Checked
//2. Unchecked

//Checked---that is checked by the compiler at compile time
//Can not be ignored and should be handled

//Unchecked---that occurs at time of execution
//Are ignored at compilation time

public class OOPs {
    public static void avg() {
        try {
            int abbas = 6;
            throw new ArithmeticException("Demo");
        } catch (ArithmeticException e) {
            System.out.println("Arithmatic Exception");
        }
    }

    public static void check() throws ArithmeticException {
        System.out.println("Inside check function");
        throw new ArithmeticException();
    }

    public static void main(String args[]) {
        try {
            System.out.println("Enter two integers : ");
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("result = " + c);
        } catch (Exception e) {
            System.out.println("Can not be divided by zero");
        }

        try {
            int num = Integer.parseInt("Mukesh");
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Number format exceotion");
        }

        // Nested Try and Catch
        try {
            try {
                int num = Integer.parseInt("Mukesh");
                System.out.println(num);
            } catch (Exception e) {
                System.out.println("Number format exception");
            }
            try {
                int[] array = new int[5];
                array[7] = 20;

            } catch (Exception e) {
                System.out.println("Array out of bound exception");
            }
            System.out.println("Something other");
        } catch (Exception e) {
            System.out.println("Handled");
        }

        // Muti Catch
        try {

        } catch (NumberFormatException e1) {

        } catch (ArrayIndexOutOfBoundsException e2) {

        } catch (ArithmeticException e3) {

        }

        // Finally
        try {

        } catch (NumberFormatException e1) {

        } catch (ArrayIndexOutOfBoundsException e2) {

        } catch (ArithmeticException e3) {

        } finally {
            System.out.println("Always executed");
        }

        // throw(used to throw an exception)
        avg();

        try {
            check();
        } finally {
            System.out.println("Caught");
        }
    }

}
// Types of exceptions
// Built in
// Example--Arithmatic,IO,ClassNotFound,Runtime,ArrayOutOfBound,NoSuchMethod..etc

// User defined
//

// Uncaught exceptions
// Exception occurs when an exception is not caught by a programming construct
// or by the programmer,
// it results in an uncaught exception. In Java, for example,
// this would be an unhandled exception that would terminate the program.
