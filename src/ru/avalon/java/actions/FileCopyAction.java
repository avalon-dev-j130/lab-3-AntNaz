package ru.avalon.java.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Действие, которое копирует файлы в пределах дискового
 * пространства.
 */
public class FileCopyAction implements Action {
    /**
     * {@inheritDoc}
     */
    
    //добавленный мной метод.
    
 File in = new File ("File.txt");
 File out = new File ("folderToCopy/File.txt");
    
    @Override
    public void run()  {
        
     try {
         
         Files.copy(in.toPath(), out.toPath(), StandardCopyOption.REPLACE_EXISTING);
         
         /*
         * TODO №2 Реализуйте метод run класса FileCopyAction
         */ //throw new UnsupportedOperationException("Not implemented yet!");
     } catch (IOException ex) {
            System.out.println("File was not found");
     }
     
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() throws Exception {
        
        /*
         * TODO №3 Реализуйте метод close класса FileCopyAction
         */
        //throw new UnsupportedOperationException("Not implemented yet!");
    }
}
