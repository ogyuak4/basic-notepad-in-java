
package com.mycompany.simplenotepad;


public class Function_Edit {
    SimpleNotepad gui;
    public Function_Edit(SimpleNotepad gui){
        this.gui=gui;
        
    }
    public void undo(){
        gui.um.undo();
        
    }
    
    public void redo(){
        gui.um.redo();
        
    }
    
}
