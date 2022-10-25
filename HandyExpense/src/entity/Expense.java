/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author duytr
 */
public class Expense {

    public static String DISPLAY_FORMAT_HEADER = "%-5s|%-15s|%-15s|%-15s\n";
    public static String DISPLAY_HEADER
            = String.format(DISPLAY_FORMAT_HEADER, "ID", "Date", "Amount of money", "Content");
    private int id;
    private String date;
    private double money;
    private String content;

    public Expense() {
    }

    public Expense(int id, String date, double money, String content) {
        this.id = id;
        this.date = date;
        this.money = money;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {
        return String.format(DISPLAY_FORMAT_HEADER, id, date, money, content);
    }
}
