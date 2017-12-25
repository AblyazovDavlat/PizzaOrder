/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff;

/**
 *
 * @author dablyazo
 */
public class IDgenerator 
{
    private int mSeed;
    
    public IDgenerator()
    {
        mSeed = 1000;
    }
    
    public int generateID()
    {
        mSeed++;
        return (mSeed - 1);
    }
}
