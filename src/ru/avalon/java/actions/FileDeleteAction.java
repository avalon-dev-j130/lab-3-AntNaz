/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.actions;

import java.io.File;

/**
 *
 * @author AntNaz
 */
public class FileDeleteAction implements Action {
    File file = new File ("File.txt");
    
    @Override
    public void run() {
        if (file.exists()) file.delete();
        else System.out.println("File was not found.");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void close() throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
