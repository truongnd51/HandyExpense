/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author duytr
 */
public class Validation {

    private static final Scanner sc = new Scanner(System.in);
    

    public static int getInt(String mess, String errorNumberFormat, int min, int max) {
        while (true) {
            int ret = Integer.parseInt(getStringByRegex(mess, errorNumberFormat, "[0-9]+"));
            if (ret < min || ret > max) {
                System.err.println("Please enter number in rage [" + min + ", " + max + "]");
            } else {
                return ret;
            }
        }

    }

    public static double getDouble(String mess, String errorNumberFormat, double min, double max) {
        while (true) {
            double ret = Double.parseDouble(getStringByRegex(mess, errorNumberFormat, "[0-9]+"));
            if (ret < min || ret > max) {
                System.err.println("Please enter number in rage [" + min + ", " + max + "]");
            } else {
                return ret;
            }
        }

    }

    public static String getStringByRegex(String mess, String error, String regex) {
        Scanner scan = new Scanner(System.in);
        String output;
        while (true) {
            System.out.print(mess);
            output = scan.nextLine();
            if (output.matches(regex)) {
                return output;
            } else {
                System.err.println(error);
            }
        }
    }

    public static String getInputDate(String mess, String errorDateFormat) {
        System.out.print(mess);
        while (true) {
            try {
                Date date = new Date(); 
                String result = sc.nextLine();
                SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MMM/yyyy",Locale.US);
                dateFormatter.setLenient(false);
                date = dateFormatter.parse(result);
                    return dateFormatter.format(date);
                
                
            } catch (ParseException e) {
                System.err.println(errorDateFormat);
            }
        }
    }
}
