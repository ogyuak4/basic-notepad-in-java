

package com.mycompany.simplenotepad;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.nio.file.Files.size;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;


public class SimpleNotepad implements ActionListener{
    
    
    
    JFrame window;
    JTextArea textArea;
    JScrollPane scrollPane;
    JMenuBar menuBar;
    JMenu menuFile, menuEdit, menuFormat, menuColor;
    JMenuItem iNew, iOpen, iSave, iSaveAs, iExit;
    
    JMenuItem iUndo, iRedo;
    
    Function_File file = new Function_File(this);
    Function_Edit edit= new Function_Edit(this);
    
    
    
    
    
    UndoManager um=new UndoManager();
    

    public static void main(String[] args) {
        Programm programm= new Programm();
        programm.starttt();
        programm.controlll();
        programm.goend();
        
       
        
        new SimpleNotepad();
        
        programm.starttt();
        programm.controlll();
        programm.gostart();
        
    }
    public SimpleNotepad(){
        createWindow();
        createTextArea();
        createMenuBar();
        createFileMenu();
        createEditMenu();
        
        
        Botbuttonfactory botbuttonfactory= new Botbuttonfactory();
        botbuttonfactory.getButtontype("botbutton","blue");
        System.out.println("position and colour of the button is :");
        System.out.println(botbuttonfactory.getButtontype("Botbutton", "blue"));
        //ops 2
        //Buttontype botbutton=Buttontypefactory.getButtontype("botbutton", "blue");
        //System.out.println("button type is ");
        //System.out.println(botbutton);
        //ops
        
        JButton botbutton = new JButton("About us");
        botbutton.setFont(new java.awt.Font("Dialog", 0, 15));
        botbutton.setBorderPainted(false);
        botbutton.setFocusable(false);
        botbutton.setForeground(new java.awt.Color(255, 255, 255));
        botbutton.setBackground(new java.awt.Color(0, 140, 255));
        
        window.add(botbutton, BorderLayout.PAGE_END);
        
        botbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("this is a project and im a student. My name is Oğulcan. The course name: object oriented programming");
            }
        }
        );
        
    
        
        
        window.setVisible(true);
        
                
        
    }
    
        
   
    
    public void createWindow(){
        Window bigwindow= Windowfactory.getWindow("Bigwindow",800,600);
        System.out.println("size of the window is: ");
        System.out.println(bigwindow);
        
        
        window=new JFrame("Notepad");
        window.setSize(bigwindow.getWidth(),bigwindow.getHeight());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    public void createTextArea(){
        textArea= new JTextArea();
        
        
        
        
        textArea.getDocument().addUndoableEditListener(
        new UndoableEditListener(){
            public void undoableEditHappened(UndoableEditEvent e){
                um.addEdit(e.getEdit());
            }
        });
        
        
        scrollPane=new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        window.add(scrollPane); 
    }
    
    public void createMenuBar(){
        menuBar= new JMenuBar();
        window.setJMenuBar(menuBar);
        
        menuFile= new JMenu("File");
        menuBar.add(menuFile);
        
        menuEdit= new JMenu("Edit");
        menuBar.add(menuEdit);
        
        menuFormat= new JMenu("Format");
        menuBar.add(menuFormat);
        
        menuColor= new JMenu("Color");
        menuBar.add(menuColor);
         
    }
    public void createFileMenu(){
        iNew=new JMenuItem("New");
        iNew.addActionListener(this);
        iNew.setActionCommand("New");
        menuFile.add(iNew);
        
        iOpen=new JMenuItem("Open");
        iOpen.addActionListener(this);
        iOpen.setActionCommand("Open");
        menuFile.add(iOpen);
        
        iSave=new JMenuItem("Save");
        iSave.addActionListener(this);
        iSave.setActionCommand("Save");
        menuFile.add(iSave);
        
        iSaveAs=new JMenuItem("SaveAs");
        iSaveAs.addActionListener(this);
        iSaveAs.setActionCommand("SaveAs");
        menuFile.add(iSaveAs);
        
        iExit=new JMenuItem("Exit");
        iExit.addActionListener(this);
        iExit.setActionCommand("Exit");
        menuFile.add(iExit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command= e.getActionCommand();
        
        switch(command){
        case "New" : file.newFile(); break;
        case "Open" : file.open(); break;
        case "Save" : file.save(); break;
        case "SaveAs" : file.saveAs(); break;
        case "Exit" : file.exit(); break;
        case "Undo" : edit.undo();break;
        case "Redo" : edit.redo();break;
        
        }
        
    }
    public void createEditMenu(){
        iUndo=new JMenuItem("Undo");
        iUndo.addActionListener(this);
        iUndo.setActionCommand("Undo");
        menuEdit.add(iUndo);
        
        iRedo=new JMenuItem("Redo");
        iRedo.addActionListener(this);
        iRedo.setActionCommand("Redo");
        menuEdit.add(iRedo);
        
    }
}
        
        