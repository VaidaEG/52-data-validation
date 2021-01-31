/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.validation;

import java.util.Scanner;

/**
 *
 * @author 37067
 */
public class DataValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyList ml = new MyList();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter number:");
            String s = sc.nextLine();
            if ("".equals(s)) {
                break;
            }
            try {
                double d = Double.parseDouble(s);
                ml.add(d);    
            } catch (NumberFormatException ex) {
                System.out.println("Incorrect number format");
            }
        }
        System.out.println(ml);
        double sum = 0;
        for (int i = 0; i < ml.size(); i++) {
            sum += (Double) ml.get(i);
        }
        System.out.println("Total sum: " + sum);
        System.out.println("Total elements: " + ml.size());
        if (ml.size() > 0) {
            System.out.println("Average: " + sum / ml.size()); 
        }
    }
}
