/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package takeout;

import java.util.Scanner;

/**
 *
 * @author USER
 */
interface BeefBurger{
    String getBurger();
}
interface ChickenBurger{
    String getBurger();
}


class BeefCheeseDelight implements BeefBurger{

    @Override
    public String getBurger() {
        return "Double Beef Patty + Cheddar Cheese\n";
    }
    
}
class BeefAndBacon implements BeefBurger{

    @Override
    public String getBurger() {
        return "200 gm Beef Patty + Bacon + BBQ sauce + Cheddar Cheese\n";
    }
    
}

class ChickenCheeseDelight implements ChickenBurger{

    @Override
    public String getBurger() {
        return "Double Chicken Patty + Cheddar Cheese\n";
    }
    
}

class ChickenSupremeBurger implements ChickenBurger{

    @Override
    public String getBurger() {
        return "Double Chicken Patty + BBQ sauce + Cheddar Cheese\n";
    }
}

class BBQChickenBurgerWithCheese implements ChickenBurger{

    @Override
    public String getBurger() {
        return "Single Chicken Patty + BBQ sauce + Cheese\n";
    }
}

class BBQChickenBurger implements ChickenBurger{

    @Override
    public String getBurger() {
        return "Single Chicken Patty + BBQ sauce\n";
    }
}

class CChickenBurger implements ChickenBurger{

    @Override
    public String getBurger() {
        return "Single Chicken Patty\n";
    }
}


class FactoryProducer {
    public static AbstractBurgerFactory getFactory(String Type){
        if(Type.equalsIgnoreCase("Beef")){
            System.out.println("Beef Burgers ==>>\n 1.Beef Cheese Delight\n 2.Beef And Bacon\n");
            return new BeefBurgerFactory();
        }
        else if(Type.equalsIgnoreCase("Chicken")){
            System.out.println("Cheese Burgers ===>\n 1.Chicken Cheese Delight\n 2.Chicken Supreme Burger\n");
            return new ChickenBurgerFactory();
        }
        return null;
    } 
}
    



public class TakeOut {   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Beef/Chicken : \n");
        String type=sc.nextLine();
        AbstractBurgerFactory beeffactory =FactoryProducer.getFactory(type);
        System.out.println("which one?:\n");
        type=sc.nextLine();
        BeefBurger beefburger=beeffactory.getBeefBurger(type);
        System.out.println("You have been served:\n");
        System.out.println(beefburger.getBurger().toString());
        // TODO code application logic here
    }
    
}
