
package com.mycompany.simplenotepad;


public class Topbuttonfactory implements Buttontypesfactory {

    @Override
    public Buttontype getButtontype(String position, String colour) {
        return new Topbutton(position,colour);
    }
    
}
