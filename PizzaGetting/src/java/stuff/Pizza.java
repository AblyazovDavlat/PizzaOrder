/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff;
import MyWS.*;

/**
 *
 * @author dablyazo
 */
public class Pizza
{
    private static class IDgenerator
    {
        private static int mSeed;
        
        public IDgenerator()
        {
            mSeed = 1000;
        }
        
        public static int generateID()
        {
            mSeed++;
            return (mSeed - 1);
        }
    }
    private int id;
    private String name;
    private int cost;
    private String description;

    
    public Pizza ( String _name, int _cost, String _description ){
        id = IDgenerator.generateID();
        name = _name;
        cost = _cost;
        description =_description;
    }
    


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}
