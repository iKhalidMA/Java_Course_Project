import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Project one! \t salary Details\n------------------");

        /*
            inputs > baseSalary , incentives ,workPerHour , taxesPercentage , taxes, netSalary
            processes > taxes = baseSalary * taxesPercentage && netSalary = (baseSalary + incentives )-taxes
            outputs > salary after taxes,  netSalary
        */
        Scanner salariesDetails = new Scanner(System.in);
        ///
        float taxesPercentage = 0.3f;
        double baseSalary, incentives, taxes, workPerHour, BonusHour, netSalary = 0;
        ///
        System.out.print("Please dear employee, Enter your base Salary for some operations: ");
        baseSalary = salariesDetails.nextDouble();
        System.out.print("Please dear employee, Enter your incentive per hour for some operations: ");
        workPerHour = salariesDetails.nextDouble();
        System.out.print("Please dear employee, Enter your additions hours for some operations: ");
        BonusHour = salariesDetails.nextDouble();
        ///
        taxes = baseSalary * taxesPercentage;
        incentives = workPerHour * BonusHour;
        netSalary = (baseSalary + incentives) - taxes;
        ///
        System.out.println("your base Salary is equal to: \t" + baseSalary);
        System.out.println("Taxes \t" + taxes);
        System.out.println("Salary after taxes: \t" + (baseSalary - taxes));
        System.out.println("Incentive \t" + incentives);
        ///
        System.out.println("-----------------");
        System.out.println("Net Salary:\t " + netSalary + "EGP");


    }
}

