/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package takeout_2.pkg0;

import java.util.LinkedList;

/**
 *
 * @author USER
 */
public class Burger {
    private int patty;
    private int cheese;
    private int sauce;
    private int bacon;
    private int cost;
    private int amount;

    
    public void setPatty(int patty) {
        this.patty = patty;
    }

    

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

   

    public void setSauce(int sauce) {
        this.sauce = sauce;
    }

    

    public void setBacon(int bacon) {
        this.bacon = bacon;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCost() {
        return cost;
    }
    
    
    
    
    public void Show(){
        System.out.println(amount+ " PCS With");
        System.out.println("Patty------"+patty);
        System.out.println("Cheese-----"+cheese);
        System.out.println("Sauce------"+sauce);
        System.out.println("Bacon------"+bacon);
        System.out.println("------------------");
        System.out.println("Cost:      "+cost);
        
    }

    
    
    
    
}
