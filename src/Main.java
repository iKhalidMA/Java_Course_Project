import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Project one! \t salary Details\n------------------");

        /*
            inputs > baseSalary , incentives ,workPerHour , taxesPercentage , taxes, netSalary
            processes > taxes = baseSalary * taxesPercentage && netSalary = (baseSalary + incentives )-taxes
            outputs > salary after taxes,  netSalary
        */
        /*  other Tasks:
            1- let the taxPercent .5 -> when the base salary equal or more than 30K
            2- if the employee worked more than 15 h -> his normal working incentives  + 500
            3- Target Details multiply by 0.05 for each month
            4- make functions for separation of concern
         */

        calculateNetSalary();

        calculateTarget(20000);

    }

    public static void calculateNetSalary() {
        Scanner salariesDetails = new Scanner(System.in);
//       /// Declaration
        double taxPercent, incentives = 0, taxes, netSalary = 0.0;
        /// Initiation
        System.out.print("Please dear employee, Enter your base Salary for some operations:? ");
        double baseSalary = salariesDetails.nextDouble();
        System.out.print("Please dear employee, Enter your incentive per hour for some operations:? ");
        double workPerHour = salariesDetails.nextDouble();
        System.out.print("Please dear employee, Enter your work hours for some operations:? ");
        double bonusHour = salariesDetails.nextDouble();
        // Processes
        if (baseSalary >= 30000) {
            taxPercent = .5;
        } else taxPercent = .2;
        taxes = taxPercent * baseSalary;
        if (bonusHour > 15) {
            incentives = workPerHour * bonusHour + 500;
        } else {
            incentives = workPerHour * bonusHour;
        }
        netSalary = baseSalary + incentives - taxes;


        printDetails(baseSalary, taxes, incentives, netSalary);

    }
    // Outputs
    public static void printDetails(double base, double taxes, double inc, double net) {
        System.out.println("your base Salary is equal to: \t" + base);
        System.out.println("Taxes \t" + taxes);
        System.out.println("Salary after taxes: \t" + (base - taxes));
        System.out.println("Incentive \t" + inc);
        ///
        System.out.println("-----------------");
        System.out.println("Net Salary:\t " + (int) net + " EGP");
    }

    public static void calculateTarget(double sales) {
        double targetPercent = .05;
        for (int i = 1; i < 13; i++) {
            System.out.println("month  " + i + "  :" + (int) sales);
            sales += (sales * targetPercent);
        }
    }
}

// Last Editing 22 Feb - Khalid Maher