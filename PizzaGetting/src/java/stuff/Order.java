/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff;

import java.util.ArrayList;

/**
 *
 * @author dablyazo
 */

public class Order {
    
    private static class IDgenerator
    {
        private static int mSeed;
        
        public IDgenerator()
        {
            mSeed = 10000;
        }
        
        public static int generateID()
        {
            mSeed++;
            return (mSeed - 1);
        }
    }

    private int number;
    private ArrayList<Integer> idPizza;
    private ArrayList<Integer> quanPizza;
    private String status;

    public Order( ArrayList<Integer> _idPizza, ArrayList<Integer> _quanPizza, String _status){
        number = IDgenerator.generateID();
        idPizza = _idPizza;
        quanPizza = _quanPizza;
        status = _status;
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<Integer> getIdPizza() {
        return idPizza;
    }

    public ArrayList<Integer> getQuanPizza() {
        return quanPizza;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
