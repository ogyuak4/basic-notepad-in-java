
package com.mycompany.simplenotepad;


public class Windowfactory {
    public static Window getWindow(String size,int width,int height){
        Window window;
        if("Miniwindow".equals(size)){
            window=new Miniwindow(size, width, height);
        }
        else if ("Bigwindow".equals(size)) {
            window=new Bigwindow(size, width, height);
        }
        else {
            throw new RuntimeException("not proper size");   
        }
       
        return window; 
        
        
    }
    
}
