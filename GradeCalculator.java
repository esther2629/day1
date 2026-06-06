import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double average = total / 3.0;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);

        if (average >= 90)
            System.out.println("Grade A");
        else if (average >= 75)
            System.out.println("Grade B");
        else if (average >= 50)
            System.out.println("Grade C");
        else
            System.out.println("Fail");
    }
}