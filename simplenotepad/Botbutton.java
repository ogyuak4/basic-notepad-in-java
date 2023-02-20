
package com.mycompany.simplenotepad;


public class Botbutton implements Buttontype{
    private String position;
    private String colour;

    public Botbutton(String position, String colour) {
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






