
package com.mycompany.simplenotepad;


public class Miniwindow implements Window {
    private String size;
    private int width;
    private int height;

    public Miniwindow(String size,int width,int height) {
        this.size=size;
        this.width=width;
        this.height=height; 
        
    }

    
    
    
    public String getSize() {
        return size;
    }

    
    public int getWidth() {
        return width;
    }

    
    public int getHeight() {
        return height;
    }
    
    public String toString(){
       return size + "\n"+ width+ "\n" + height;
   }
   
    
    
}
