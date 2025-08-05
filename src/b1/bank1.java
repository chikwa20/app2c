package b1;

import java.util.Scanner;
import b2.bank2;

public class bank1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello Welcome to my System!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");

        bank2[] bap = new bank2[10]; 
        int index = 0; 

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        int resp;

        switch (choice) {
            case 1:
                do {
                    System.out.println("\n1. Register Account");
                    System.out.println("2. Login Account");
                    System.out.println("3. View All Accounts");
                    System.out.print("Enter: ");
                    int action = sc.nextInt();

                    switch (action) {
                        case 1:
                            if (index < 10) { 
                                bap[index] = new bank2();
                                System.out.print("Enter Account No.: ");
                                int accNo = sc.nextInt();
                                System.out.print("Enter Account Pin: ");
                                int pin = sc.nextInt();
                                bap[index].setAccountNo(accNo);
                                bap[index].setPin(pin);
                                System.out.println("Account Registered");
                                index++; 
                            } else {
                                System.out.println("Stop! mana oi, 10 ra gani limit ba");
                            }
                            break;

                        case 2:
                            if (index == 0) {
                                System.out.println("Wa pa gani kay account, pamaymay");
                                break;
                            }

                            int attempts = 3;
                            boolean success = false;

                            while (attempts > 0 && !success) {
                                System.out.print("Enter your Account No: ");
                                int inputAcc = sc.nextInt();
                                System.out.print("Enter your Pin: ");
                                int inputPin = sc.nextInt();

                                for (int i = 0; i < index; i++) {
                                    if (bap[i].verifyAccount(inputAcc, inputPin)) {
                                        System.out.println("Login Successful!");
                                        success = true;
                                        break;
                                    }
                                }

                                if (!success) {
                                    attempts--;
                                    if (attempts == 0) {
                                        System.out.println("ATTEMPT LIMIT REACHED!");
                                        System.exit(0);
                                    } else {
                                        System.out.println("INVALID! Attempts left: " + attempts);
                                    }
                                }
                            }
                            break;

                        case 3:
                            if (index == 0) {
                            System.out.println("wa pakay accounts.");
                            } else {
                            System.out.println("Accounts:");
                            for (int i = 0; i < index; i++) {
                            System.out.println("Account #" + i + ": " + bap[i].getAccountNo());
                            }
                            }
                            break;

                        default:
                            System.out.println("Invalid action!");
                    }

                    System.out.print("\nDo you want to continue? (1 kung ganahan ka mo padyon / 0 = aww sgy layas): ");
                    resp = sc.nextInt();
                } while (resp == 1);
                break;

            case 2:
                System.out.println("wa pa!");
                break;

            case 3:
                System.out.println("wa pa!");
                break;

            default:
                System.out.println("Invalid, di lagi pamaymay!");
        }

        sc.close();
    }
}
