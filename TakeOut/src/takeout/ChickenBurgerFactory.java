/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package takeout;

/**
 *
 * @author USER
 */
public class ChickenBurgerFactory extends AbstractBurgerFactory{
    ChickenBurger getChickenBurger(String Type){
        
        if (Type.equalsIgnoreCase("ChickenCheeseDelight")){
            return new ChickenCheeseDelight();
        }
        else if(Type.equalsIgnoreCase("ChickenSupremeBurger")){
            return new ChickenSupremeBurger();
        }
        return null;
    }
    
}
