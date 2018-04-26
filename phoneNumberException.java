/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionCheck;

/**
 *
 * @author sony
 */
public class phoneNumberException extends Exception{
    public static final int small = 9;
    public static final int large = 11;
    
    public String tryNumber(lengthClass g) throws lengthException{
        int l = g.getLength();
        
        if(l <= small)
            throw new lengthException("Length of the number entered too small !");
        else if(l >= large)
            throw new lengthException("Length of the number entered too big !");
        return "Valid Entry";
    }
}
