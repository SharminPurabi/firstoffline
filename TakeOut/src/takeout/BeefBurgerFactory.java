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
public  class BeefBurgerFactory extends AbstractBurgerFactory {
    BeefBurger getBeefBurger(String Type){
        
        if(Type.equalsIgnoreCase("Beef Cheese Delight")){
            return new BeefCheeseDelight();
        }
        if(Type.equalsIgnoreCase("Beef And Bacon")){
            return new BeefAndBacon();
        }
        return null;
    }
    
}
