/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

//import static beans.StorageBean.schedule;
import java.util.ArrayList;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import stuff.Order;
import stuff.Pizza;
import static MyWS.MyWebService.myStorage;

/**
 *
 * @author dablyazo
 */
@Stateless
@LocalBean
public class SessionBean 
{
    public int sum (int a, int b)
    {
        return (a+b);
    }
    
    public String getPizzaList ()
    {
        String tmpPizzaList = new String();
        
        if (myStorage.pizzaList.isEmpty())
        {
            return "EMPTY";
        }
        
        for (int i = 0; i < myStorage.pizzaList.size(); i++)
        {
            tmpPizzaList = tmpPizzaList.concat(" | Menu # " + i + ": ");
            tmpPizzaList = tmpPizzaList.concat("ID = " + String.valueOf(myStorage.pizzaList.get(i).getId()) + ", ");
            tmpPizzaList = tmpPizzaList.concat("name = " + String.valueOf(myStorage.pizzaList.get(i).getName()) + ", ");
            tmpPizzaList = tmpPizzaList.concat("cost = " + String.valueOf(myStorage.pizzaList.get(i).getCost()) + ", ");
            tmpPizzaList = tmpPizzaList.concat("description = " + String.valueOf(myStorage.pizzaList.get(i).getDescription()));
        }
        return tmpPizzaList;
    }
    
    public int addNewPizza(String name, int cost, String description) {
      
        Pizza newPizza = new Pizza(name, cost, description);
        myStorage.pizzaList.add(newPizza);
        return newPizza.getId();
    }
    
    public String removePizza(int idPizza) {
        
         for (int i = 0; i < myStorage.pizzaList.size(); i++)
        {
            if (myStorage.pizzaList.get(i).getId() == idPizza)
            {
                myStorage.pizzaList.remove(i);
                return "Pizza witn ID: " + i + " remove from menu";
            }
        }
        return "ID doesnt exists";
    }
    
    public String changeOrderStatus(int number, String status) {
        
        for (int i = 0; i < myStorage.pizzaList.size(); i++)
        {
            if (myStorage.orderList.get(i).getNumber() == number){
                myStorage.orderList.get(i).setStatus(status);
                return "Status is changed to " + status + "for order with number " + i;
            }
        }
        return "This order doesnt exits";
    }
    
    public String checkOrderStatus(int number) {
        
        for (int i = 0; i < myStorage.pizzaList.size(); i++)
        {
            if (myStorage.orderList.get(i).getNumber() == number){
                return "Order status is: " + myStorage.orderList.get(i).getStatus() + "for order with number " + i;
            }
        }
        return "This order doesnt exits";
    }
    
    public String addNewOrder(ArrayList<Integer> pizzaInOrder, ArrayList<Integer> quanInOrder) {
        
        Order newOrder = new Order(pizzaInOrder, quanInOrder, "Added");
        String dataOut;
        int sum = 0;
        int idPizzaInOrder = -1;
        int costPizzaInOrder = -1;
        
        for (int i = 0; i < pizzaInOrder.size(); i++){
            idPizzaInOrder = pizzaInOrder.get(i);
            for (int j = 0; j < myStorage.pizzaList.size(); j++)
            {
                if (myStorage.pizzaList.get(i).getId() == idPizzaInOrder)
                {
                    costPizzaInOrder = myStorage.pizzaList.get(i).getCost();
                    sum += costPizzaInOrder * quanInOrder.get(i);
                }
            }
        }
        dataOut = "Number order is " + newOrder.getNumber() + ". Order for an amount " + sum;
        return dataOut;
    }
    
}
