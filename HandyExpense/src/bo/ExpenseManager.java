/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Expense;
import java.util.ArrayList;

/**
 *
 * @author duytr
 */
public class ExpenseManager {
    private ArrayList<Expense> listExpense;
    private int lastId = 0;

    public ExpenseManager() {
        listExpense = new ArrayList<>();
    }

    public ArrayList<Expense> getExpense() {
        return listExpense;
    }

    public Expense addExpense(Expense e) {
        e.setId(++lastId);
        listExpense.add(e);
        return e;
    }

    public Expense deleteExpense(int id) throws Exception {
        int i = searchById(id);
        if (i != -1) {
            return listExpense.remove(i);
        }
        throw new Exception("Task not found!");

    }

    private int searchById(int id) {
        for (int index = 0; index < listExpense.size(); index++) {
            if (listExpense.get(index).getId() == id) {
                return index;
            }
        }
        return -1;
    }
}
