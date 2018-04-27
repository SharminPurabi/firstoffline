/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeefactory;

/**
 *
 * @author USER
 */

public class CoffeeFactory {
    private static CoffeeFactory connection;
    private CoffeeFactory() {
   }
   public static CoffeeFactory getDbConnection() {
      if (connection== null ) 
		connection= new CoffeeFactory() ;                           

      return connection;
    }

    public static Coffee  ProduceCoffee(String Type){
       
        if(Type.equalsIgnoreCase("A")){
            return new CoffeeA();
        }
        else if(Type.equalsIgnoreCase("B")){
            return new CoffeeB();
        }
        else if(Type.equalsIgnoreCase("C")){
            return new CoffeeC();
        }
        return null;
    }
    
}
