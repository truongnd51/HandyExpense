/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.ExpenseInputer;
import bo.ExpenseManager;
import entity.Expense;
import utils.Validation;

/**
 *
 * @author duytr
 */
public class ExpenseController {

    private ExpenseInputer expenseInputer;
    private ExpenseManager expenseManager;

    public ExpenseController() {
        expenseManager = new ExpenseManager();
    }

    public void addExpense() throws Exception {
        expenseInputer = new ExpenseInputer();
        expenseInputer.inputExpense();
        Expense t = expenseInputer.getExpense();
        expenseManager.addExpense(t);
    }

    public void deleteExpense() throws Exception {
        int id = Validation.getInt("Enter ID: ", "Please enter integer number!", 1, Integer.MAX_VALUE);
        expenseManager.deleteExpense(id);
    }

    public void displayExpense() {
        System.out.print(Expense.DISPLAY_HEADER);
        for (Expense e : expenseManager.getExpense()) {
            System.out.print(e);
        }
        double total = 0;
        for (int i = 0; i < expenseManager.getExpense().size(); i++) {
            total += expenseManager.getExpense().get(i).getMoney();
        }
        System.out.println("Total: " + total);
    }
}
