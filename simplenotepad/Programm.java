
package com.mycompany.simplenotepad;


public class Programm {
    private Programstate programstate;

    public Programm() {
        programstate=new Beforeprogram();
    }
    public void starttt(){
        programstate.aboutprogram();             
    }
    
    public void controlll(){
        programstate.programcontroller();
    }
    
    public void goend(){
        System.out.println("...");
        programstate=new Afterprogram();
    }
    
    public void gostart(){
        System.out.println(".......");
        programstate=new Beforeprogram();
    }
    
    
    
}
