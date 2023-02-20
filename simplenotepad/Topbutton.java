
package com.mycompany.simplenotepad;


public class Topbutton implements Buttontype{
    private String position;
    private String colour;

    public Topbutton(String position, String colour) {
        this.position=position;
        this.colour=colour;
    }
    
    

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public String getColour() {
        return colour;
    }
    
    public String toString(){
       return position + "\n"+ colour;
               
   }
    
}
