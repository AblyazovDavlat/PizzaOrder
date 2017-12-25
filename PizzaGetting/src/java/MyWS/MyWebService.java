/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyWS;

import beans.SessionBean;
import beans.StorageBean;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author ablya
 */
@WebService(serviceName = "MyWebService")
@Stateless()
public class MyWebService {

    public static StorageBean myStorage;
    
    public MyWebService()
    {
        //serviceList = new ArrayList();
        //schedule = new Timetable();
        myStorage = new StorageBean();
    }
    
    public static int findPizzaInServiceList(int _ID)
    {
        for (int i = 0; i < myStorage.pizzaList.size(); i++)
        {
            if (myStorage.pizzaList.get(i).getId() == _ID)
            {
                return i;
            }
        }
        return -1;
    }
    
    @EJB
    private SessionBean sessionBean;
    
    @WebMethod
    public int addNewPizza(String name, int cost, String description)
    {
        return sessionBean.addNewPizza(name, cost, description);
    }
    
    @WebMethod
    public String removePizza(int idPizza)
    {
        return sessionBean.removePizza(idPizza);
    }
    
    @WebMethod
    public String getPizzaList ()
    {
        return sessionBean.getPizzaList();
    }
    
    @WebMethod
    public String checkOrderStatus(int number)
    {
        return sessionBean.checkOrderStatus(number);
    }
    
    @WebMethod
    public String changeOrderStatus(int number, String status)
    {
        return sessionBean.changeOrderStatus(number, status);
    }
    
    @WebMethod
    public String addNewOrder(ArrayList<Integer> pizzaInOrder, ArrayList<Integer> quanInOrder)
    {
        return sessionBean.addNewOrder(pizzaInOrder, quanInOrder);
    }
    
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
}
