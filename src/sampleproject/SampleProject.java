
package sampleproject;

import java.util.Scanner;

public class SampleProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int byear;
        
        System.out.print("Enter name: ");
        name = sc.nextLine();
        
        System.out.print("Enter birth year: ");
        byear = sc.nextInt();
        
        System.out.println("\nHello "+name+" your age is "+(2025-byear));
        
        if((2025-byear) >= 18 ){
            System.out.println("Votable");
        }else{
            System.out.println("Minority");
        }
        
    }
    
}
