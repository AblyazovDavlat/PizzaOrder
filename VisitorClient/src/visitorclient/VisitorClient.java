/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorclient;

import java.util.ArrayList;
import java.util.Scanner;
import myws.*;

/**
 *
 * @author ablya
 */
public class VisitorClient {

    static private void printMenu()
    {
        System.out.println("This is Visitor client");
        System.out.println("1. Get Pizza menu");
        System.out.println("2. Make a pizza order");
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
                    System.out.println("Enter id of pizza - amount of pizza");
                    System.out.println("To make an order -Enter Go!");
                    ArrayList<Integer> ids = new ArrayList<Integer>();
                    ArrayList<Integer> amounts = new ArrayList<Integer>();
                    int i = 0;
                    while(i<2){
                        ids.add(in.nextInt());
                        amounts.add(in.nextInt());
                        i++;
                    }
                    System.out.println(service.addNewOrder(ids, amounts));
                    System.out.println("Press anykey to continue...");
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
