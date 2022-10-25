/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Expense;
import utils.Validation;

/**
 *
 * @author duytr
 */
public class ExpenseInputer {

    private Expense e;

    public Expense getExpense() {
        return e;
    }

    private void inputInformation() {
        e = new Expense();
        e.setDate(Validation.getInputDate("Enter date with format dd/MMM/yyyy: ", "Format dd/MMM/yyyy only! "));
        e.setMoney(Validation.getDouble("Enter Amount of money: ", "Please enter Integer Number!", 0, Double.MAX_VALUE));
        e.setContent(Validation.getStringByRegex("Enter Content: ", "Content should contain only letter. Enter again: ", "[A-Za-z ]+"));
    }

    public void inputExpense() {
        inputInformation();
    }
}
