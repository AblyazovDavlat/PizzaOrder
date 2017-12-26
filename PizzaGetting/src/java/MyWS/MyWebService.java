/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyWS;

import java.util.ArrayList;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import stuff.Order;
import stuff.Pizza;

/**
 *
 * @author ablya
 */
@WebService(serviceName = "MyWebService")
@Stateless()
public class MyWebService {
    
    public ArrayList<Pizza> pizzaList = new ArrayList();
    public ArrayList<Order> orderList = new ArrayList();

    
    @WebMethod
    public int addNewPizza(String name, int cost, String description)
    {
        Pizza newPizza = new Pizza(name, cost, description);
        pizzaList.add(newPizza);
        return newPizza.getId();
    }
    
    @WebMethod
    public String removePizza(int idPizza)
    {
                for (int i = 0; i <  pizzaList.size(); i++)
        {
            if ( pizzaList.get(i).getId() == idPizza)
            {
                 pizzaList.remove(i);
                return "Pizza witn ID: " + i + " remove from menu";
            }
        }
        return "ID doesnt exists";
    }
    
    @WebMethod
    public String getPizzaList ()
    {
        String tmpPizzaList = new String();
        
        if (pizzaList.isEmpty())
        {
            return "EMPTY";
        }
        
        for (int i = 0; i < pizzaList.size(); i++)
        {
            tmpPizzaList = tmpPizzaList.concat(" | Menu # " + i + ": ");
            tmpPizzaList = tmpPizzaList.concat("ID = " + String.valueOf(pizzaList.get(i).getId()) + ", ");
            tmpPizzaList = tmpPizzaList.concat("name = " + String.valueOf(pizzaList.get(i).getName()) + ", ");
            tmpPizzaList = tmpPizzaList.concat("cost = " + String.valueOf(pizzaList.get(i).getCost()) + ", ");
            tmpPizzaList = tmpPizzaList.concat("description = " + String.valueOf(pizzaList.get(i).getDescription()));
        }
        return tmpPizzaList;
    }
    
    @WebMethod
    public String checkOrderStatus(int number)
    {
        for (int i = 0; i <  pizzaList.size(); i++)
        {
            if ( orderList.get(i).getNumber() == number){
                return "Order status is: " +  orderList.get(i).getStatus() + "for order with number " + i;
            }
        }
        return "This order doesnt exits";
    }
    
    @WebMethod
    public String changeOrderStatus(int number, String status)
    {
        for (int i = 0; i <  pizzaList.size(); i++)
        {
            if ( orderList.get(i).getNumber() == number){
                 orderList.get(i).setStatus(status);
                return "Status is changed to " + status + "for order with number " + i;
            }
        }
        return "This order doesnt exits";
    }
    
    @WebMethod
    public String addNewOrder(ArrayList<Integer> pizzaInOrder, ArrayList<Integer> quanInOrder)
    {
        Order newOrder = new Order(pizzaInOrder, quanInOrder, "Added");
        orderList.add(newOrder);
        String dataOut;
        int sum = 0;
        int idPizzaInOrder = -1;
        int costPizzaInOrder = -1;
        
        for (int i = 0; i < pizzaInOrder.size(); i++){
            idPizzaInOrder = pizzaInOrder.get(i);
            for (int j = 0; j <  pizzaList.size(); j++)
            {
                if ( pizzaList.get(i).getId() == idPizzaInOrder)
                {
                    costPizzaInOrder =  pizzaList.get(i).getCost();
                    sum += costPizzaInOrder * quanInOrder.get(i);
                }
            }
        }
        dataOut = "Number order is " + newOrder.getNumber() + ". Order for an amount " + sum;
        return dataOut;
    }
    
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
}
