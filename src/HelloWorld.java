import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");

        System.out.println("Enter the YEAR: ");
        LeapYear leapYear = new LeapYear();
        Scanner sc = new Scanner(System.in);
        leapYear.year = sc.nextInt();

        leapYear.isLeapYear();
    }
}
