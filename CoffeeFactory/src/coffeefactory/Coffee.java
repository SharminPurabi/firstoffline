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
public interface Coffee{
    void make();
}
class CoffeeA implements Coffee{

    @Override
    public void make() {
        System.out.println("Milk+Sugar+Caffein");
    }
    
}
class CoffeeB implements Coffee{

    @Override
    public void make() {
        System.out.println("Milk+Caffein");
    }
    
}

class CoffeeC implements Coffee{

    @Override
    public void make() {
        System.out.println("Milk+Sugar+Caffein");
    }
    
}
