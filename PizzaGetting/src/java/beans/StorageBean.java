/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import javax.ejb.Stateful;
import javax.ejb.LocalBean;
// stuff.BarbershopService;
import stuff.Order;
import stuff.Pizza;
/*import stuff.Timetable;
import stuff.TimetableDay;*/

/**
 *
 * @author dablyazo
 */
@Stateful
@LocalBean
public class StorageBean 
{
   // public static ArrayList<BarbershopService> serviceList;
    public static ArrayList<Pizza> pizzaList;
    public static ArrayList<Order> orderList;
    
   /* public static Timetable schedule;
    public static ArrayList<String> months;
    public static ArrayList<Timetable.sharedNote> notes;
    
    public static TimetableDay[][] year;
    
    private static int MONTH_COUNT = 12;
    private static int AVERAGE_MOUNTH_LENGTH = 30;*/
    
    public StorageBean()
    {
        /*serviceList = new ArrayList();
        schedule = new Timetable();*/
        
        pizzaList = new ArrayList();
        orderList = new ArrayList();
                
        /*notes = new ArrayList();
        months = new ArrayList();
        months.add("JAN");
        months.add("FEB");
        months.add("MAR");
        months.add("APR");
        months.add("MAY");
        months.add("JUN");
        months.add("JUL");
        months.add("AUG");
        months.add("SEP");
        months.add("OCT");
        months.add("NOV");
        months.add("DEC");
        
        year = new TimetableDay[MONTH_COUNT][AVERAGE_MOUNTH_LENGTH];
        for (int i = 0; i < MONTH_COUNT; i++)
        {
            for (int j = 0; j < AVERAGE_MOUNTH_LENGTH; j++)
            {
                year[i][j] = new TimetableDay();
            }
        }*/
    }
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
