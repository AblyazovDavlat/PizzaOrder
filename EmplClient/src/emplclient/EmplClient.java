/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emplclient;

import java.util.Scanner;

/**
 *
 * @author ablya
 */
public class EmplClient {

    /**
     * @param args the command line arguments
     */
    static private void printMenu()
    {
        System.out.println("This is Employee client");
        System.out.println("1. Get Pizza menu");
        System.out.println("2. Add new pizza in menu");
        System.out.println("3. Remove new pizza from menu");
        System.out.println("4. Change order status");
    }
    
    public static void main(String[] args) 
    {
        MyWebService_Service serviceHolder = new MyWebService_Service();
        MyWebService service = serviceHolder.getMyWebServicePort();
        Scanner in = new Scanner(System.in);
        
        while (true)
        {
            printMenu();
            int operation = in.nextInt();
        
            switch (operation)
            {
                case 1:
                {
                    System.out.println(service.getPizzaList());
                    System.out.println("Press anykey to continue...");
                    in.nextLine();
                    break;
                }
                case 2:
                {
                    in.nextLine();
                    System.out.println("Enter name for Pizza");
                    String name = in.nextLine();
                    System.out.println("Enter cost for Pizza");
                    String cost = in.nextLine();
                    int costInt = Integer.valueOf(cost);
                    System.out.println("Enter description for Pizza");
                    String description = in.nextLine();
                    System.out.println(service.addNewPizza(name, costInt, description));
                    System.out.println("Press anykey to continue...");
                    in.nextLine();                    
                    break;
                }
                case 3:
                {
                    in.nextLine();
                    System.out.println("Enter ID ");
                    String idPizza = in.nextLine();
                    System.out.println(service.removePizza(Integer.valueOf(idPizza)));
                    System.out.println("Press anykey to continue...");
                    in.nextLine();
                    break;
                   
                }
                case 4:
                {
                    in.nextLine();
                    System.out.println("Enter number of order");
                    String numOrder = in.nextLine();
                    System.out.println("Enter new status for order");
                    String status = in.nextLine();
                    System.out.println(service.changeOrderStatus(Integer.valueOf(numOrder), status));
                    System.out.println("Press anykey to continue...");
                    in.nextLine();
                    break;
                }
                default:
                {
                    System.out.println("Wrong command");
                }
            }
            
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }

    }
}
