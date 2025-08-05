
package aaapplication;

import java.util.Scanner;

public class act1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String name;
        float hoursWorked, hourRate, gww;
        double sss, nww;
        
        System.out.print("Enter employee name: ");
        name = sc.nextLine();
        System.out.print("Enter hourly rate: ");
        hourRate = sc.nextFloat();
        System.out.println("Enter total hours worked this week: ");
        hoursWorked = sc.nextFloat();
        
        gww =hourRate * hoursWorked;
        sss =  gww * 0.10;
        nww = gww - sss;
        
        System.out.println("---Wage Salary---");
        System.out.println("Employee: "+name);
        System.out.println("Hourly Rate: ₱ "+hourRate);
        System.out.println("Hours Worked: ₱ "+hoursWorked);
        System.out.println("Gross Weekly Wage: ₱"+gww);
        System.out.println("SSS Contribution(10%): ₱"+sss);
        System.out.println("-----------------------");
        System.out.println("Net Weekly Wage: ₱%"+nww);
    }
    
}
