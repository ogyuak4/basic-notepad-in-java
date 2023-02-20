
package com.mycompany.simplenotepad;


public class Botbuttonfactory implements Buttontypesfactory{

    @Override
    public Buttontype getButtontype(String position, String colour) {
        return new Botbutton(position, colour);
       
    }
    
    
}
