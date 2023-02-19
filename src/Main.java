import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Project one! \t salary Details\n------------------");

        /*
            inputs > baseSalary , incentives ,workPerHour , taxesPercentage , taxes, netSalary
            processes > taxes = baseSalary * taxesPercentage && netSalary = (baseSalary + incentives )-taxes
            outputs > salary after taxes,  netSalary
        */
        /* Additional Tasking:
            1- let the taxPercent .5 -> when the base salary equal or more than 30K
            2- if the employee worked more than 15 h -> his normal working incentives  + 500
            3- Target Details for annual multiply by 0.05 for each month
         */
        Scanner salariesDetails = new Scanner(System.in);
//        ///
        double baseSalary, taxPercent = 0, incentives, taxes, workPerHour, BonusHour, netSalary = 0.0;
        ///
        System.out.print("Please dear employee, Enter your base Salary for some operations: ");
        baseSalary = salariesDetails.nextDouble();
        System.out.print("Please dear employee, Enter your incentive per hour for some operations: ");
        workPerHour = salariesDetails.nextDouble();
        System.out.print("Please dear employee, Enter your work hours for some operations: ");
        BonusHour = salariesDetails.nextDouble();
        ///
        double baseSalaryCondition = 30_000.0;
        if (baseSalary <= baseSalaryCondition) {
            taxPercent = 0.05;
        }
        taxes = baseSalary * taxPercent;
        if (workPerHour >= 15) {
            incentives = workPerHour * BonusHour + 500;
        } else {
            incentives = workPerHour * BonusHour;
        }
        ;
        netSalary = (baseSalary + incentives) - taxes;
        ///
        System.out.println("your base Salary is equal to: \t" + baseSalary);
        System.out.println("Taxes \t" + taxes);
        System.out.println("Salary after taxes: \t" + (baseSalary - taxes));
        System.out.println("Incentive \t" + incentives);
        ///
        System.out.println("-----------------");
        System.out.println("Net Salary:\t " + netSalary + "EGP");
//

//
        System.out.println("Target Details \n");
        double monthTargrt = salariesDetails.nextDouble();
        double targetPercent = .05;
        for (int i = 1; i < 13; i++) {
            System.out.println("month  " + i + "  :" + (int) monthTargrt);
            monthTargrt += (monthTargrt * targetPercent);
        }
    }
}

