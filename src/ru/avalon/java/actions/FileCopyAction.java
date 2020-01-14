package ru.avalon.java.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;
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
    public static void Copy () throws FileNotFoundException, IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream("File.txt");
            out = new FileOutputStream("folderToMove/File.txt");
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            
        }
        finally {
            in.close();
            out.close();
        }
        
        
    }
   
    
    @Override
    public void run()  {
        try {
            Copy();
        } catch (IOException ex) {
        }
        /*
         * TODO №2 Реализуйте метод run класса FileCopyAction
         */
        //throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() throws Exception {
        
        /*
         * TODO №3 Реализуйте метод close класса FileCopyAction
         */
        throw new UnsupportedOperationException("Not implemented yet!");
    }
}
