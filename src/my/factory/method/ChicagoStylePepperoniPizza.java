/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.factory.method;

/**
 *
 * @author future
 */
public class ChicagoStylePepperoniPizza extends Pizza{
    public ChicagoStylePepperoniPizza() {
	name = "Chicago Style Pepperoni Pizza";        
        dough = "Extra Thick Crust Dough";
	sauce = "Plum Tomato Sauce";
 
	toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
	toppings.add("Spinach");
        toppings.add("Eggplant");
	toppings.add("Sliced Pepperoni");
    }
}
