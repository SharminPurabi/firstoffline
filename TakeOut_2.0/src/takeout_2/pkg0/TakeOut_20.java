/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package takeout_2.pkg0;

import java.util.Scanner;

/**
 *
 * @author USER
 */

interface IBuilder{
    void getPatty();
    void getCheese();
    void getSauce();
    void getbacon();
    Burger getBurger();
    void getamount(int amount);
    void getCost(Integer amount);

}

class ChickenBurger implements IBuilder{
    private Burger burger=new Burger();
    @Override
    public void getPatty() {
        burger.setPatty(1);   
    }

    @Override
    public void getCheese() {
        burger.setCheese(0);
    }

    @Override
    public void getSauce() {
        burger.setSauce(0);
    }
    public void getbacon(){
        burger.setBacon(0);
    }
    public void getamount(int amount){
        burger.setAmount(amount);
    }
    public void getCost(Integer amount){
        burger.setCost(amount*160);
    }

    @Override
    public Burger getBurger() {
        System.out.println("You have been served Chicken Burger...");
        return burger;
    }
}


class ChickenCheeseBurger implements IBuilder{
    private Burger burger=new Burger();
    @Override
    public void getPatty() {
        burger.setPatty(1);   
    }

    @Override
    public void getCheese() {
        burger.setCheese(1);
    }

    @Override
    public void getSauce() {
        burger.setSauce(0);
    }
    public void getbacon(){
        burger.setBacon(0);
    }
    public void getamount(int amount){
        burger.setAmount(amount);
    }
    public void getCost(Integer amount){
        burger.setCost(amount*180);
    }

    @Override
    public Burger getBurger() {
        System.out.println("You have been served Chicken Cheese Burger...");
        return burger;
    }
}

class BBQChickenCheeseBurger implements IBuilder{
    private Burger burger=new Burger();
    @Override
    public void getPatty() {
        burger.setPatty(1);   
    }

    @Override
    public void getCheese() {
        burger.setCheese(1);
    }

    @Override
    public void getSauce() {
        burger.setSauce(1);
    }
    public void getbacon(){
        burger.setBacon(0);
    }
    public void getamount(int amount){
        burger.setAmount(amount);
    }
    public void getCost(Integer amount){
        burger.setCost(amount*205);
    }

    @Override
    public Burger getBurger() {
        System.out.println("You have been served BBQ Chicken Cheese Burger...");
        return burger;
    }
}

class ChickenSupremeBurger implements IBuilder{
    private Burger burger=new Burger();
    @Override
    public void getPatty() {
        burger.setPatty(1);   
    }

    @Override
    public void getCheese() {
        burger.setCheese(1);
    }

    @Override
    public void getSauce() {
        burger.setSauce(1);
    }
    public void getbacon(){
        burger.setBacon(1);
    }
    public void getamount(int amount){
        burger.setAmount(amount);
    }
    public void getCost(Integer amount){
        burger.setCost(amount*385);
    }

    @Override
    public Burger getBurger() {
        System.out.println("You have been served Chicken Supreme Burger...");
        return burger;
    }
}

class ChickenCheeseDelight implements IBuilder{
    private Burger burger=new Burger();
    @Override
    public void getPatty() {
        burger.setPatty(2);   
    }

    @Override
    public void getCheese() {
        burger.setCheese(2);
    }

    @Override
    public void getSauce() {
        burger.setSauce(1);
    }
    public void getbacon(){
        burger.setBacon(0);
    }
    public void getamount(int amount){
        burger.setAmount(amount);
    }
    public void getCost(Integer amount){
        burger.setCost(amount*265);
    }

    @Override
    public Burger getBurger() {
        System.out.println("You have been served Chicken Cheese Delight...");
        return burger;
    }
}



class BeefBurger implements IBuilder{
    private Burger burger=new Burger();

    @Override
    public void getPatty() {
        burger.setPatty(1);
        
    }

    @Override
    public void getCheese() {
        burger.setCheese(0);
    }

    @Override
    public void getSauce() {
        burger.setSauce(0);
    }
    public void getbacon(){
        burger.setBacon(0);
    }

    @Override
    public Burger getBurger() {
        System.out.println("You have been served Beef Burger...");
        return burger;
    }

    @Override
    public void getCost(Integer amount) {
        burger.setCost(amount*230);
    }

    @Override
    public void getamount(int amount) {
        burger.setAmount(amount);
    }

}

class BeefCheeseBurger implements IBuilder{
    private Burger burger=new Burger();
    @Override
    public void getPatty() {
        burger.setPatty(1);   
    }

    @Override
    public void getCheese() {
        burger.setCheese(1);
    }

    @Override
    public void getSauce() {
        burger.setSauce(0);
    }
    public void getbacon(){
        burger.setBacon(0);
    }
    public void getamount(int amount){
        burger.setAmount(amount);
    }
    public void getCost(Integer amount){
        burger.setCost(amount*180);
    }

    @Override
    public Burger getBurger() {
        System.out.println("You have been served Beef Cheese Burger...");
        return burger;
    }
}

class BBQBeefCheeseBurger implements IBuilder{
    private Burger burger=new Burger();
    @Override
    public void getPatty() {
        burger.setPatty(1);   
    }

    @Override
    public void getCheese() {
        burger.setCheese(1);
    }

    @Override
    public void getSauce() {
        burger.setSauce(1);
    }
    public void getbacon(){
        burger.setBacon(0);
    }
    public void getamount(int amount){
        burger.setAmount(amount);
    }
    public void getCost(Integer amount){
        burger.setCost(amount*205);
    }

    @Override
    public Burger getBurger() {
        System.out.println("You have been served BBQ Beef Cheese Burger...");
        return burger;
    }
}
class BeefANDBaconBurger implements IBuilder{
    private Burger burger=new Burger();
    @Override
    public void getPatty() {
        burger.setPatty(1);   
    }

    @Override
    public void getCheese() {
        burger.setCheese(1);
    }

    @Override
    public void getSauce() {
        burger.setSauce(1);
    }
    public void getbacon(){
        burger.setBacon(1);
    }
    public void getamount(int amount){
        burger.setAmount(amount);
    }
    public void getCost(Integer amount){
        burger.setCost(amount*385);
    }

    @Override
    public Burger getBurger() {
        System.out.println("You have been served Beef and Bacon Burger...");
        return burger;
    }
}
class BeefCheeseDelight implements IBuilder{
    private Burger burger=new Burger();
    @Override
    public void getPatty() {
        burger.setPatty(2);   
    }

    @Override
    public void getCheese() {
        burger.setCheese(2);
    }

    @Override
    public void getSauce() {
        burger.setSauce(1);
    }
    public void getbacon(){
        burger.setBacon(0);
    }
    public void getamount(int amount){
        burger.setAmount(amount);
    }
    public void getCost(Integer amount){
        burger.setCost(amount*265);
    }

    @Override
    public Burger getBurger() {
        System.out.println("You have been served Beef Cheese Delight...");
        return burger;
    }
}


class Director{
    IBuilder mybuilder;
    public void construct(IBuilder builder,Integer amount){
        mybuilder=builder;
        mybuilder.getPatty();
        mybuilder.getCheese();
        mybuilder.getSauce();
        mybuilder.getbacon();
        mybuilder.getCost(amount);
        mybuilder.getamount(amount);
 }
}
class boy{
    public IBuilder getbuilder(String which){
        if(which.compareToIgnoreCase("1")==0){
           return new ChickenBurger(); 
        }
        else if(which.compareToIgnoreCase("2")==0){
           return new ChickenCheeseBurger(); 
        }
        else if(which.compareToIgnoreCase("3")==0){
            return new BBQChickenCheeseBurger();
        }
        else if(which.compareToIgnoreCase("4")==0){
           return new ChickenSupremeBurger(); 
        }
        else if(which.compareToIgnoreCase("5")==0){
            return new ChickenCheeseDelight();
        }
        else if(which.compareToIgnoreCase("6")==0){
           return new BeefBurger(); 
        }
        else if(which.compareToIgnoreCase("7")==0){
           return new BeefCheeseBurger(); 
        }
        else if(which.compareToIgnoreCase("8")==0){
           return new BBQBeefCheeseBurger(); 
        }
        else if(which.compareToIgnoreCase("9")==0){
           return new BeefANDBaconBurger(); 
        }
        else if(which.compareToIgnoreCase("10")==0){
           return new BeefCheeseDelight(); 
        }
            
        return null;
}

}

public class TakeOut_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        System.out.println("Available Burgers---");
        System.out.println("Chicken==>\n1.Chicken Burger\n2.Chicken Cheese Burger\n3.BBQ Chicken Cheese Burger\n4.Chicken Supreme Burger\n5.Chicken Cheese Delight\n");
        System.out.println("Beef==>\n6.Beef Burger\n7.Beef Cheese Burger\n8.BBQ Beef Cheese Burger\n9.Beef And Bacon Burger\n10.Beef Cheese Delight");
        
        while(true){
        
        Scanner sc=new Scanner(System.in);
        String choice=sc.nextLine();
        String delims = "[ ]+";
        String[] tokens = choice.split(delims);
        Integer totalcost=0;
        for (int i = 0; i < tokens.length; i=i+2){
         Director director=new Director();
        boy b=new boy();
        IBuilder builder=b.getbuilder(tokens[i]);
        director.construct(builder,Integer.parseInt(tokens[i+1]));
        Burger burger=builder.getBurger();
        totalcost+=burger.getCost();
        burger.Show();
        }
            System.out.println("_________________________");
            System.out.println("Total Bill:   "+totalcost);
            System.out.println("Thank You.Visit Us Again");
        }
        
        
        
    }
    
}
