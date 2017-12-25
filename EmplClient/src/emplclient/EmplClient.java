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
        System.out.println("2. Make a pizza order");
        System.out.println("3. Check status order");
        System.out.println("3. Check status order");
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
                    System.out.println("Enter date as <Day>'<Month>");
                    in.nextLine();
                    break;
                }
                case 3:
                {
                    in.nextLine();
                    System.out.println("Enter number your order");
                    String numberOrder = in.nextLine();
                    System.out.println(service.checkOrderStatus(Integer.valueOf(numberOrder)));
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
