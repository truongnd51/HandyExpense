package ui;

import controller.ExpenseController;
import utils.Validation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author duytr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExpenseController tc = new ExpenseController();
        String menu = "-------------------------\n"
                + "TASK MANAGEMENT PROGRAM\n"
                + "1. Add an expense\n"
                + "2. Display all expense\n"
                + "3. Delete an expense\n"
                + "4. Quit\n"
                + "(Please choose 1 to Add, 2 to Display, 3 to Delete, 4 to Quit program)\n"
                + "Enter choice: ";
        while (true) {
            int choice = Validation.getInt(menu, "Please enter Integer Number!", 1, 4);
            switch (choice) {
                case 1:
                    try {
                        tc.addExpense();
                        System.out.println("Add Expense success!");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }

                    break;

                case 2:
                    tc.displayExpense();
                    
                    break;
                case 3:
                    try {
                        tc.deleteExpense();
                        System.out.println("Delete Expense success!");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 4:
                    return;
            }

        }
    }

}
