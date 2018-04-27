/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeefactory;

import java.util.Scanner;

/**
 *
 * @author USER
 */


public class ordercoffee {
    public static void main(String[] args) {
      System.out.println("Menu===>\nCoffee A\nCoffee B(Diabetic)\nCoffee C\nOrder Please .....");
    Scanner sc=new Scanner(System.in);
    String type=sc.nextLine();
    CoffeeFactory coffeefactory=CoffeeFactory.getDbConnection();
    
    Coffee coffee=coffeefactory.ProduceCoffee(type);
     System.out.println("You have been served - ");
    coffee.make();
    
    } 
    
}
