import java.util.Arrays;
import java.util.Scanner;

public class hello {

    public static void func(String naam) {
        System.out.println(naam);
    }

    public static void main(String args[]) {
        // print
        System.out.println("Hello");

        // string
        String name = "Aman";
        String neighbour = "Aaloo";

        String padosi = name;

        // integer
        int age = 30;

        // Primitive

        // byte ---- 1[-128 to 127]
        byte age1 = 10;

        // short ----2

        // int ----4
        int phone = 1234567890;

        // long ----8
        long phone1 = 39856827659834L;

        // float ----4
        float pi = 3.14F;

        // double ----8

        // char ----2
        char letter = '@';

        // boolean ----1 [true/false]
        boolean isTausif = true;

        // Non-primitive--->they hace their own methods

        // string
        String name1 = "Gufran";
        System.out.println(name1.length());

        String friend = new String("Babu");

        // String Concatenate
        String a = "Tausif";
        String b = "Bhihari";
        String c = a + b;
        String d = a + "and" + b;

        System.out.println(d);

        // Element at any index
        System.out.println(d.charAt(1));

        // replace any character
        String e = name.replace('a', 'b');
        System.out.println(e);

        // substing (first index included and last index not included)
        System.out.println(a.substring(0, 3));

        // Arrays
        int[] marks = new int[3];
        marks[0] = 3;
        marks[1] = 2;
        marks[2] = 4;

        int[] num = { 3, 4, 5 };

        // length of array(No need to put parenthesis)
        System.out.println(marks.length);

        // sorting an array
        Arrays.sort(marks);

        // 2D Array
        int[][] finalMarks = { { 3, 5, 2 }, { 9, 3, 2 } };
        System.out.println(finalMarks[0][0]);

        // casting
        // implicit casting
        double price = 100.00;
        double finalPrice = price + 18;

        // int a = 18+price;

        // implicit casting
        int p = 30;
        int fp = p + (int) 13.34;

        // constants
        final int x = 100;
        // x=40;(can not be reassigned)

        // Operators
        // +.-,*,/,%
        // ++,--

        // Maths
        System.out.println(Math.min(5, 3));
        System.out.println(Math.random());

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your height");
        int height = sc.nextInt();

        // next.Float
        // next.Char etc

        // for string we use sc.next()
        System.out.println("Naam likho");
        // String naam = sc.next();
        // System.out.println(naam);

        // for full sentence we use
        String naam = sc.nextLine();

        // comparision opertors
        // ==,!=,<,>,<=,>=

        // logical operators
        // &&,||

        // if(condition)
        // by default condition==true is checked

        // conditionals
        int Abbas = 10;
        int Tausif = 9;

        if (Abbas == Tausif) {
            System.out.println("Both are bhai");
        } else {
            System.out.println("Both are friends");
        }

        int day = 1;

        switch (day) {
            case 1: {
                System.out.println("Monday");
                break;
            }

            case 2: {
                System.out.println("Tuesday");
                break;
            }

            default:
                System.out.println("NO day");

        }

        // loops

        // for loops
        // same as c++

        // while
        // same as c++

        // do while
        // same as c++
        int z = 100;
        do {
            System.out.println(z);
            z--;
        } while (z >= 0);

        // break and continue
        // same as c++

        // Exception handling
        int[] numbers = { 97, 98, 95 };

        try {
            System.out.println(numbers[5]);
        } catch (Exception exception) {
            // do something after catching

        }
        System.out.println(numbers[2]);

        // Functions or methods
        func(naam);

    }
}