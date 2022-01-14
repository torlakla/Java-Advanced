package Lab.DefiningClasses.BankAccount_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        HashMap<Integer, BankAccount> accounts = new HashMap<>();
        String output="";
        while (!input.equals("End")) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    accounts.put(bankAccount.getId(), bankAccount);
                    output = String.format("Account ID%d created", bankAccount.getId());
                    break;
                case "Deposit":
                    int id = Integer.parseInt(command[1]);
                    double amount = Double.parseDouble(command[2]);
                    if (accounts.containsKey(id)) {
                        accounts.get(id).deposit(amount);
                        output = String.format("Deposited %.0f to ID%d", amount, id);
                    } else {
                        output = "Account does not exist";
                    }

                    break;
                case "SetInterest":
                    double rate = Double.parseDouble(command[1]);
                    BankAccount.setInterestRate(rate);
                    output=" ";
                    break;
                case "GetInterest":
                    int id1 = Integer.parseInt(command[1]);
                    int years = Integer.parseInt(command[2]);
                    if (accounts.containsKey(id1)) {
                        double interest = accounts.get(id1).getInterest(years);
                        output = String.format("%.2f", interest);
                    } else {
                        output = "Account does not exist";
                    }
                    break;


            }
            if (!output.equals(" ")) {
                System.out.println(output);
            }


            input = scan.nextLine();
        }

    }


}
